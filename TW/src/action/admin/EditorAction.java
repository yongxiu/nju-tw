package action.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;



import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.BrandDao;
import dao.IWorkDao;

public class EditorAction extends ActionSupport{
	private List<String> list;
	private Map<String,List<String>> map;
	
	public String execute() {
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
