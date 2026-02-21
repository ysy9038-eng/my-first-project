package util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import vo.LocalVo;

public class MyKakaoUtils {

	public static List<LocalVo> search_local(String query, double x, double y, int radius, int page,int size){
		
		List<LocalVo> list = new ArrayList<LocalVo>();
		
		String kakao_api_key = "KakaoAK 2e54f212e04b344f99cfd95c6c652b92";
		
		try {
			
			query = URLEncoder.encode(query,"utf-8");
			
			String str_url = String.format("https://dapi.kakao.com/v2/local/search/keyword.json?query=%s&x=%.12f&y=%.12f&radius=%d&sort=distance&page=%d&size=%d",
																							query,        x,      y,		radius				 ,page , size   );
			URL	url = new URL(str_url);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			//Kakao Rest API Key 설정
			connection.setRequestProperty("Authorization",kakao_api_key );

			
			// 받을요청타입
			connection.setRequestProperty("Content-Type", "application/xml"); 
			connection.connect();
			
			//읽어온 데이터를 누적
			StringBuilder sb = new StringBuilder();
			
			//byte stream
			InputStream is = connection.getInputStream();
			
			//character stream
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			
			//Buffered stream
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				
				String data = br.readLine();	//1줄씩 받는다
				if(data==null)break;
				
				sb.append(data);
			
			}//end:while
			
			//System.out.println(sb.toString());
			
			//JSON Parsing
			JSONObject json = new JSONObject(sb.toString());
			
			JSONArray local_array = json.getJSONArray("documents");
			
			for(int i=0; i<local_array.length();i++) {	// i = 0 1 2 3 ... 14
				
				JSONObject local = local_array.getJSONObject(i);
			
				String place_name = local.getString("place_name");
				String place_url  = local.getString("place_url");
				String phone	  = local.getString("phone");
				String address_name = local.getString("address_name");
				String road_address_name = local.getString("road_address_name");
				
				int distance = -1;
				double x1 	 = 0;
				double y1 	 = 0;
				
				try {
					distance = local.getInt("distance");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					
					x1 = local.getDouble("x");
					y1 = local.getDouble("y");
				
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				//LocalVo 포장
				LocalVo vo = new LocalVo(place_name, place_url, address_name, road_address_name, phone, x1, y1, distance);
				
				//List에추가
				list.add(vo);
			}//end:for
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	
	}
}
