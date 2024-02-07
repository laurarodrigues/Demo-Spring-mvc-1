package comt.test.hplus.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;

public class LogginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		//get all cookies
		//log session id an request path
		
		String sessionId = null;
		
		if(null!=request.getCookies()) {
			for(Cookie cookie: request.getCookies()) {
				if("JSESSIONID".equals(cookie.getName())) {
					sessionId = cookie.getValue();
				}
			}
		}
		
		System.out.println("Incomming request data log: session: "+sessionId+
				" at "+ new Date()+" for "+request.getRequestURI());
		
		return true;
	}
	
	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("in post handle");
    }
	
}
