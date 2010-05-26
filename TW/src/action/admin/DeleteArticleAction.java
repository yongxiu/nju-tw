package action.admin;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import service.LuceneIndexWriter;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.GenericArticleDao;

public class DeleteArticleAction extends ActionSupport{
	
	String[] checkId;
	
	public String execute() throws Exception{
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article = null;
		String INDEX_PATH = ServletActionContext.getServletContext().getRealPath("/")+"index";
		long id ;
		for(int i=0;i<checkId.length;i++) {
			id = Long.parseLong(checkId[i]);
			System.out.println(id);
			article = articleDao.getById(id);
		
			//delete index
			
			LuceneIndexWriter.deleteIndex(INDEX_PATH, article);
			System.out.println("delete index");
			
			//delete article
		   articleDao.delete(id);
		   System.out.println("delete article:"+id);
			
			
		}
		
		
	
		return SUCCESS;
	}  
	public String[] getCheckId() {
		return checkId;
	}
	public void setCheckId(String[] checkId) {
		this.checkId = checkId;
	}
	


	
	
	
	
	
}
