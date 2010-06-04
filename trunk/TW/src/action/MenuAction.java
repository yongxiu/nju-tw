/**
 * @author Yongxiu
 * @version Jun 3, 2010 11:28:57 PM
 *
 */

package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

public class MenuAction extends ActionSupport implements SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	private Map session;

	@SuppressWarnings("unchecked")
	public Map getSession() {
		return session;
	}

	@SuppressWarnings("unchecked")
	public void setSession(Map session) {
		this.session = session;
	}
	
	public String execute() {
		User user = (User) getSession().get("user");
		if(user != null) {
			if(user.getRole() == 1) {
				return "admin.success";
			} else {
				return "customer.success";
			}
		} else {
			return "customer.success";
		}
	}
}

