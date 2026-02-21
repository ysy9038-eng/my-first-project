package listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

	int count=0;
    /**
     * Default constructor. 
     */
    public MySessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	HttpSession session = se.getSession();
    	System.out.printf("생성된 세션 ID:%s\n",session.getId());
    	count++;
    	System.out.printf("현 접속자수:%d(명)",count);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	HttpSession session = se.getSession();
    	System.out.printf("소멸된 세션 ID:%s\n",session.getId());
    	
    	count--;
    	System.out.printf("소멸:현 접속자수:%d(명)\n",count);
    }
	
}
