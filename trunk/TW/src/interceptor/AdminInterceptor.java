package interceptor;

import java.util.Map;

import bean.User;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AdminInterceptor extends AbstractInterceptor{
	private String message;
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map session = arg0.getInvocationContext().getSession();
		User user = (User) session.get("user");
		int role = user.getRole();
		
		if(role == 1) {
			return arg0.invoke();
		}
		else {
			this.message = "权限不够";
			return "roleError";
		}
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
