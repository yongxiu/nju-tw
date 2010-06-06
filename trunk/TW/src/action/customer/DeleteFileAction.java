package action.customer;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import service.LuceneIndexWriter;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.FileDao;
import dao.GenericArticleDao;

public class DeleteFileAction extends ActionSupport implements SessionAware {

	String[] checkId;
	private Map session;

	public String execute() throws Exception {
		long uid = (Long) getSession().get("id");
		FileDao fileDao = new FileDao();
		bean.File file = null;

		long id;
		for (int i = 0; i < checkId.length; i++) {
			id = Long.parseLong(checkId[i]);
			System.out.println(id);
			file = fileDao.getById(id);
			
			if(file.getUser().getId() == uid) {
				// delete files
				String path = file.getPath();
				path = path.substring(3);
				String filePath = ServletActionContext.getServletContext().getRealPath(path);
				new File(filePath).delete();
				
				// delete files in the database
				fileDao.delete(id);
				System.out.println("delete file:" + id);
			}
		}

		return SUCCESS;
	}

	public String[] getCheckId() {
		return checkId;
	}

	public void setCheckId(String[] checkId) {
		this.checkId = checkId;
	}
	
	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

}
