package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;



import bean.IpCount;

import com.opensymphony.xwork2.ActionSupport;

import dao.IpCountDao;



public class IpcountAction extends ActionSupport{
	private long count;

      public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	int v=0;
      String countString="<br />";
	


	private static final long serialVersionUID = 1L;

	public String execute()throws Exception {
		IpCountDao dao = new IpCountDao();
		IpCount ipCount = dao.getById(1);
		count = ipCount.getCount();
		ipCount.setCount(count+1);
		dao.update(ipCount);
		while(count>0){
		
			countString="<img src='/TW/ipImage/"+count%10+".gif' />"+countString;
			count=count/10;
			System.out.println(new Date());
		}
		
		
		return SUCCESS;
		
	}

	public String getCountString() {
		return countString;
	}

	public void setCountString(String countString) {
		this.countString = countString;
	}
	
}
