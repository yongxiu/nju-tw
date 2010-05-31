package action;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import service.ImageService;

import com.opensymphony.xwork2.ActionSupport;

public class CropAction extends ActionSupport {
	
	/**
	 * @author Yongxiu
	 */
	private static final long serialVersionUID = 1L;
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	private String message;
	
	private String imageValue;
	
	public int getX1() {
		return x1;
	}


	public void setX1(int x1) {
		this.x1 = x1;
	}


	public int getX2() {
		return x2;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getY1() {
		return y1;
	}


	public void setY1(int y1) {
		this.y1 = y1;
	}


	public int getY2() {
		return y2;
	}


	public void setY2(int y2) {
		this.y2 = y2;
	}


	@Override
	public String execute() {
		message = "Success";
		ImageService service = new ImageService();
		System.out.println(x1 + " " + x2 + " " + y1 + " " + y2);
		File file = new File(ServletActionContext.getServletContext().getRealPath(imageValue.substring(3)));
		service.cutting(file, x1, y1, x2 - x1, y2 - y1);
		return SUCCESS;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setImageValue(String imageValue) {
		this.imageValue = imageValue;
	}


	public String getImageValue() {
		return imageValue;
	}
}
