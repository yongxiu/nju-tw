package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class UserInterceptor extends AbstractInterceptor{
	private String message;

	public static final String USER_KEY="UserKey";
	
	@SuppressWarnings("unchecked")
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		 Map session = actionInvocation.getInvocationContext().getSession();
		 String username = (String) session.get(USER_KEY);
		 
			if(username!=null){
				return actionInvocation.invoke();
			}
			else {
				this.setMessage("请登录");
				return Action.LOGIN;
			}
	}
	
	
	



	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
