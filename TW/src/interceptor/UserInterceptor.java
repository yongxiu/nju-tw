package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class UserInterceptor implements Interceptor{
	private String message;

	public static final String USER_KEY="UserKey";
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		String username=(String) actionInvocation.getInvocationContext().getSession().get(USER_KEY);
			if(username!=null){
				return actionInvocation.invoke();
			}
			else {
				this.setMessage("您没有登陆权限");
				return Action.INPUT;
			}
	}
	
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
