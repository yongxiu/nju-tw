package action.admin;

import com.opensymphony.xwork2.ActionSupport;

public class SuccessAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public String message = "";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
		message = "上传成功！";
		return SUCCESS;
	}

}
