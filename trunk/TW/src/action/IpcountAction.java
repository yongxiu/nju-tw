package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.Article;

import com.opensymphony.xwork2.ActionSupport;

import dao.ArticleDao;


public class IpcountAction extends ActionSupport{
	
     long count=1054;
      int v=0;
      String countString="<br />";
	
	public String getCountString() {
		return countString;
	}

	public void setCountString(String countString) {
		this.countString = countString;
	}

	private static final long serialVersionUID = 1L;

	public String execute()throws Exception {
		
		while(count>0){
		
			countString="<img src='/TW/ipImage/"+count%10+".gif' />"+countString;
			count=count/10;
			System.out.println(new Date());
		}
		return SUCCESS;
		
	}
	
}
