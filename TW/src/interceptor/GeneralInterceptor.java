package interceptor;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import bean.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class GeneralInterceptor extends AbstractInterceptor{
	private String message;

	public static final String USER_KEY="UserKey";
	
	private String url;
	
	@SuppressWarnings("unchecked")
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		 Map session = actionInvocation.getInvocationContext().getSession();
		
		 String username = (String) session.get(USER_KEY);
		 
			if(username!=null){
				
				return actionInvocation.invoke();
			}
			else {
				url = ServletActionContext.getRequest().getRequestURI();
				System.out.println(url);
				url = url.substring(4);
				actionInvocation.getInvocationContext().getSession().put("url", url);
				this.setMessage("请登录");
				return "redirectLogin";
			}
	}
	
	
	



	public void setMessage(String message) {
		this.message = message;
	}






	public String getUrl() {
		return url;
	}






	public void setUrl(String url) {
		this.url = url;
	}






	public String getMessage() {
		return message;
	}
	
	
}
