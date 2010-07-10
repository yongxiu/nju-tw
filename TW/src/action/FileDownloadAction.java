package action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.FileDao;

public class FileDownloadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long fileId;
	
	private bean.File file;
	
	private int category = 0;
	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
		FileDao fileDao = new FileDao();
		file = fileDao.getById(fileId);
	}

	// 对于上边的文件路径，给出他的输入流，对应在配置文件中的InputName属性名
	public InputStream getTargetFile() {
		String path = file.getPath();
		path = path.substring(3);
		return ServletActionContext.getServletContext().getResourceAsStream(path);
	}

	// execute方法只需返回SUCCESS
	public String execute() throws Exception {
		return SUCCESS;
	}


	public String getFilename() {
		String downFileName = file.getFilename();
		try {
			downFileName = new String(file.getFilename().getBytes("gb2312"),"iso-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return downFileName + file.getPath().substring(file.getPath().lastIndexOf('.'));
	}

	public bean.File getFile() {
		return file;
	}

	public void setFile(bean.File file) {
		this.file = file;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
	
}