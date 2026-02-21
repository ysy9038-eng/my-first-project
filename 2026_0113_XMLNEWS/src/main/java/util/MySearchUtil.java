package util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import vo.NewsVo;

public class MySearchUtil {

	public static List<NewsVo> search_news(String n_name,int start,int display)
	{
		List<NewsVo> list = new ArrayList<NewsVo>();
		String clientId = "X46jLo3nQiUoh4y1bSCu";
		String clientSecret = "qEQjtIvVM5";

		try {
			n_name = URLEncoder.encode(n_name, "utf-8");
			String urlStr = String.format("https://openapi.naver.com/v1/search/news.xml?query=%s&start=%d&display=%d",
					         n_name,start,display
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
			List<Element>   element_list = (List<Element>)root.getChild("channel").getChildren("item");

			for(Element item : element_list){
				String title = item.getChildText("title");
				String link  = item.getChildText("link");
				String image = item.getChildText("image");
				String author = item.getChildText("author");
				
				int discount=0;
				try {
					discount = Integer.parseInt(item.getChildText("discount"));
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				String publisher = item.getChildText("publisher");
				String pubdate = item.getChildText("pubdate");
				String isbn = item.getChildText("isbn");
				String description = item.getChildText("description");
				
				
				//상품목록을 포장
				NewsVo vo = new NewsVo();
				vo.setTitle(title);
				vo.setLink(link);
				vo.setImage(image);
				vo.setAuthor(author);
				vo.setDiscount(discount);
				vo.setPublisher(publisher);
				vo.setPubdate(pubdate);
				vo.setIsbn(isbn);
				vo.setDescription(description);
								
				//ArrayList에 넣기
				list.add(vo);
				

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}
	
	
}
