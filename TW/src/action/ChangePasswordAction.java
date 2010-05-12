package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class ChangePasswordAction extends ActionSupport implements SessionAware{
	private Map session;
	private String oldPassword;
	private String newPassword;
	private String newPasswordConfirmed;
	
	public String execute() {
		UserDao userDao = new UserDao();
		User user = (User) getSession().get("user");
		
		if(oldPassword==null || oldPassword.equals("")){
				addActionMessage("请输入原始密码！");
			 return INPUT;
		 }
		
		else if(newPassword==null || newPassword.equals("")){
			addActionMessage("请输入新密码！");
		 return INPUT;
		}
		else if(newPasswordConfirmed==null || newPasswordConfirmed.equals("")){
			addActionMessage("请确认新密码！");
		 return INPUT;
		}
		
		else if(!oldPassword.equals(user.getPassword())) {
			addActionMessage("您输入的原始密码不正确！");
			return INPUT;
		}
		
		
		else if (!newPassword.equals(newPasswordConfirmed)) {
			addActionMessage("两次输入的密码不一致！");
			return INPUT;
		}
		else {
			user.setPassword(newPassword);
			userDao.update(user);
			return SUCCESS;
		}
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewPasswordConfirmed() {
		return newPasswordConfirmed;
	}

	public void setNewPasswordConfirmed(String newPasswordConfirmed) {
		this.newPasswordConfirmed = newPasswordConfirmed;
	}
	
	
}
