package util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import vo.BookVo;
import vo.ProductVo;


public class MySearchUtil {




	public static List<ProductVo> search_shop(String p_name,int start,int display)
	{
		List<ProductVo> list = new ArrayList<ProductVo>();
		
		String clientId = "X46jLo3nQiUoh4y1bSCu";
		String clientSecret = "qEQjtIvVM5";

		try {
			
			
			p_name = URLEncoder.encode(p_name, "utf-8");
			
			String urlStr = String.format("https://openapi.naver.com/v1/search/shop.xml?query=%s&start=%d&display=%d",
					         p_name,start,display
					);

			URL url = new URL(urlStr);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			//발급받은 ID
			connection.setRequestProperty("X-Naver-Client-Id", clientId); 
			//발급받은 PW
			connection.setRequestProperty("X-Naver-Client-Secret", clientSecret); 
			// 받을요청타입
			connection.setRequestProperty("Content-Type", "application/xml"); 
			connection.connect();

			SAXBuilder builder = new SAXBuilder();
			Document   doc = builder.build (connection.getInputStream());

			Element  root     = doc.getRootElement();
			List<Element>   item_list =root.getChild("channel").getChildren("item");

			for(Element item : item_list){
				
				String title = item.getChildText("title");
				String link  = item.getChildText("link");
				String image = item.getChildText("image");
				
				int lprice=0,hprice=0;
				try {
					lprice = Integer.parseInt(item.getChildText("lprice"));
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					hprice = Integer.parseInt(item.getChildText("hprice"));
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				String mallName = item.getChildText("mallname");
				
			
				//상품목록을 포장
				ProductVo vo = new ProductVo(mallName, mallName, mallName, hprice, hprice, mallName);
				vo.setTitle(title);
				vo.setLink(link);
				vo.setImage(image);
				vo.setLprice(lprice);
				vo.setHprice(hprice);
				vo.setMallName(mallName);
								
				//ArrayList에 넣기
				list.add(vo);

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}//end:search_shop
	
	
	public static List<BookVo> search_product(String b_name,int start,int display)
	{
		List<BookVo> list = new ArrayList<BookVo>();
		
		String clientId = "X46jLo3nQiUoh4y1bSCu";
		String clientSecret = "qEQjtIvVM5";

		try {
			
			b_name = URLEncoder.encode(b_name, "utf-8");
			
			String urlStr = String.format("https://openapi.naver.com/v1/search/product.xml?query=%s&start=%d&display=%d",
					         b_name,start,display
					);

			URL url = new URL(urlStr);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			//발급받은 ID
			connection.setRequestProperty("X-Naver-Client-Id", clientId); 
			//발급받은 PW
			connection.setRequestProperty("X-Naver-Client-Secret", clientSecret); 
			// 받을요청타입
			connection.setRequestProperty("Content-Type", "application/xml"); 
			connection.connect();

			SAXBuilder builder = new SAXBuilder();
			Document   doc = builder.build (connection.getInputStream());

			Element  root     = doc.getRootElement();
			List<Element>   item_list =root.getChild("channel").getChildren("item");

			for(Element item : item_list){
				
				String title = item.getChildText("title");
				String link  = item.getChildText("link");
				String image = item.getChildText("image");
				String author = item.getChildText("author"); 
				String publisher = item.getChildText("publisher");
				String pubdate = item.getChildText("pubdate");
				String isbn		= item.getChildText("isbn");
				
				int discount=0;
				try {
					discount = Integer.parseInt(item.getChildText("discount"));
				} catch(Exception e) {
					// TODO:handle exception
				}
				
				
				
				//상품목록을 포장
				BookVo vo = new BookVo();
				vo.setTitle(title);
				vo.setLink(link);
				vo.setImage(image);
				vo.setAuthor(author);
				vo.setPublisher(publisher);
				vo.setPubdate(pubdate);
				vo.setPubdate(pubdate);
				vo.setIsbn(isbn);
				vo.setDiscount(discount);
								
				//ArrayList에 넣기
				list.add(vo);

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}//end:search_book
	

	
}
