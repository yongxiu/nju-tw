package action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CkeditorUploadAction extends ActionSupport {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uploadContentType;
	
	private String uploadFileName;
	
	private String CKEditorFuncNum;
	
	private String CKEditor;
	
	private String langCode;
	
	private File upload;
	
	private String type;
	
	private static Hashtable<String, ArrayList<String>> allowedExtensions;
	private static Hashtable<String, ArrayList<String>> deniedExtensions;
	
	/**
	 * @return the upload
	 */
	private ArrayList<String> stringToArrayList(String str) {
		String[] strArr = str.split("\\|");
		ArrayList<String> tmp = new ArrayList<String>();
		if (str.length() > 0) {
			for (int i = 0; i < strArr.length; ++i) {
				tmp.add(strArr[i].toLowerCase());
			}
		}
		return tmp;
	}
	
	public CkeditorUploadAction() {
		allowedExtensions = new Hashtable<String, ArrayList<String>>(3);
		deniedExtensions = new Hashtable<String, ArrayList<String>>(3);
		allowedExtensions.put("File",
				stringToArrayList(""));
		deniedExtensions.put("File",
				stringToArrayList("html|htm|php|php2|php3|php4|php5|phtml|pwml|inc|asp|aspx|ascx|jsp|cfm|cfc|pl|bat|exe|com|dll|vbs|js|reg|cgi|htaccess|asis|ftl"));
		allowedExtensions.put("Image",
				stringToArrayList("jpg|gif|jpeg|png|bmp"));
		deniedExtensions.put("Image",
				stringToArrayList(""));
		allowedExtensions.put("Flash",
				stringToArrayList("swf|fla"));
		deniedExtensions.put("Flash",
				stringToArrayList(""));
	}
	
	public File getUpload() {
		return upload;
	}

	/**
	 * @param upload the upload to set
	 */
	public void setUpload(File upload) {
		this.upload = upload;
	}

	/**
	 * @return the cKEditorFuncNum
	 */
	public String getCKEditorFuncNum() {
		return CKEditorFuncNum;
	}

	/**
	 * @param cKEditorFuncNum the cKEditorFuncNum to set
	 */
	public void setCKEditorFuncNum(String cKEditorFuncNum) {
		CKEditorFuncNum = cKEditorFuncNum;
	}

	/**
	 * @return the cKEditor
	 */
	public String getCKEditor() {
		return CKEditor;
	}

	/**
	 * @param cKEditor the cKEditor to set
	 */
	public void setCKEditor(String cKEditor) {
		CKEditor = cKEditor;
	}

	/**
	 * @return the langCode
	 */
	public String getLangCode() {
		return langCode;
	}

	/**
	 * @param langCode the langCode to set
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	/**
	 * @return the uploadContentType
	 */
	public String getUploadContentType() {
		return uploadContentType;
	}

	/**
	 * @param uploadContentType the uploadContentType to set
	 */
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	/**
	 * @return the uploadFileName
	 */
	public String getUploadFileName() {
		return uploadFileName;
	}

	/**
	 * @param uploadFileName the uploadFileName to set
	 */
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	@Override
	public String execute() throws Exception {


		
		



		if (type == null) {
			type = "File";
		}

		// 瀹炰緥鍖杁Now瀵硅薄锛岃幏鍙栧綋鍓嶆椂闂�

		
		// 实例化dNow对象，获取当前时间

		Date dNow = new Date();
		
		String strPath = "UserFiles/" + type + "/" + (new SimpleDateFormat("yyyyMM")).format(dNow);
		String currentDirPath = ServletActionContext.getServletContext().getRealPath("/" + strPath);
		File path = new File(currentDirPath);
		if(!path.exists()){
			path.mkdirs();
		}
		//FileImageInputStream is = new FileImageInputStream(this.upload);
		//FileImageOutputStream os = new FileImageOutputStream(new File(strPath + File.separator + this.uploadFileName));
		
		InputStream is = new FileInputStream(this.upload);
		
		String ext = getExtension(uploadFileName);

		// 璁剧疆涓婁紶鏂囦欢鍚�


		// 设置上传文件名

		SimpleDateFormat fileFormatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		uploadFileName = fileFormatter.format(dNow) + "." + ext;
		
		if(extIsAllowed(type, getExtension(uploadFileName))) {
			OutputStream os = new FileOutputStream(new File(currentDirPath + File.separator + uploadFileName));
			
			try {
	
				int len;
				byte[] buffer = new byte[1024];
				while ((len=is.read(buffer)) > 0) {
					os.write(buffer,0,len);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(is!=null){
					is.close();
				}
				if(os!=null){
					os.close();
				}
			}
		}
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		//杩斿洖缁檆keditor
		out.write("<script type='text/javascript'>window.parent.CKEDITOR.tools.callFunction("+this.CKEditorFuncNum+", '" + strPath + "/" + this.uploadFileName+"', '');</script>");
		return Action.NONE;
		
		
		
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	private String getExtension(String fileName) {
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}





	
	

	
	private boolean extIsAllowed(String fileType, String ext) {
		ext = ext.toLowerCase();
		ArrayList<String> allowList = (ArrayList<String>) allowedExtensions
				.get(fileType);
		ArrayList<String> denyList = (ArrayList<String>) deniedExtensions
				.get(fileType);
		if (allowList.size() == 0) {
			if (denyList.contains(ext)) {
				return false;
			} else {
				return true;
			}
		}
		if (denyList.size() == 0) {
			if (allowList.contains(ext)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}

