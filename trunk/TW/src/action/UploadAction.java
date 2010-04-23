package action;

import java.io.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	// 封装上传文件标题
	private String title;

	// 封装上传文件
	private File sunyangLogo;

	// 封装上传文件类型
	private String sunyangLogoContentType;

	// 封装上传文件名
	private String sunyangLogoFileName;

	// 封装上传文件保存路径
	private String savePath;

	// 返回文件上传路径
	private String getSavePath() {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getRealPath(savePath);
	}

	// 上传文件的getter和setter方法
	public File getSunyangLogo() {
		return sunyangLogo;
	}

	public void setSunyangLogo(File sunyangLogo) {
		this.sunyangLogo = sunyangLogo;
	}

	// 省略其它getter和setter方法
	// ...
	public String getSunyangLogoContentType() {
		return sunyangLogoContentType;
	}

	public void setSunyangLogoContentType(String sunyangLogoContentType) {
		this.sunyangLogoContentType = sunyangLogoContentType;
	}

	public String getSunyangLogoFileName() {
		return sunyangLogoFileName;
	}

	public void setSunyangLogoFileName(String sunyangLogoFileName) {
		this.sunyangLogoFileName = sunyangLogoFileName;
	}

	public void setSavePath(String value) {
		this.savePath = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String execute() throws Exception {
		// 设置上传文件存放的相对路径
		setSavePath("");
		// 以上传文件存放路径和原文件名建立一个输出流
		FileOutputStream fos = new FileOutputStream(getSavePath() + "\\"
				+ getSunyangLogoFileName());
		// 以上传文件建立一个输入流
		FileInputStream fis = new FileInputStream(getSunyangLogo());
		// 将上传文件写入到输出流所对应的文件中
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}

		return SUCCESS;
	}
}