package action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;


import dao.BrandDao;
import dao.GenericArticleDao;
import dao.IWorkDao;

public class ShowModifyArticleAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 112102139212359360L;
	
	private List<String> list;
	private Map<String,List<String>> map;
	
	
	private GenericArticle article;
	private int id;
	@SuppressWarnings("unchecked")
	private Map session;
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		GenericArticleDao articleDao = new GenericArticleDao();
		article = articleDao.getById(new Long(id));
		getSession().put("articlem",article);
		
		///////////
		IWorkDao iWorkDao = new IWorkDao();
		BrandDao brandDao = new BrandDao();
		List<String> iworks = iWorkDao.getAllIWorkNames();
		List<String> brands = brandDao.getAllBrandNames();
		 list=new ArrayList();
		 List<String> temp ;
		 map=new HashMap();
		 
		 
         //select
		 list.add("团情纵览");
         list.add("工作简报");
         list.add("理论园地");
         list.add("办事指南");
         	//iwork
         list.add("重点工作");
         	//brand
         list.add("品牌项目");
        
         //double select
         temp = new ArrayList<String>();
         temp.add("团学新闻");
         temp.add("基层采风");
         map.put("团情纵览", temp);
         
         temp = new ArrayList<String>();
         temp.add("—— ——");
         map.put("工作简报", temp);
         
         temp = new ArrayList<String>();
         temp.add("时事理论");
         temp.add("团内精神与讲话");
         temp.add("高教动态");
         temp.add("调查研究");
         map.put("理论园地", temp);
         
         temp = new ArrayList<String>();
         temp.add("—— ——");
         map.put("办事指南", temp);
         
         map.put("重点工作", iworks);
         map.put("品牌项目", brands);
		return SUCCESS;
		
	}


	public GenericArticle getArticle() {
		return article;
	}


	public void setArticle(GenericArticle article) {
		this.article = article;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@SuppressWarnings("unchecked")
	public Map getSession() {
		return session;
	}


	@SuppressWarnings("unchecked")
	public void setSession(Map session) {
		this.session = session;
	}


	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public Map<String, List<String>> getMap() {
		return map;
	}


	public void setMap(Map<String, List<String>> map) {
		this.map = map;
	}
	
	
}
