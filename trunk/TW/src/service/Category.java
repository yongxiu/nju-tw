package service;

public class Category {
	/**
	 * wjc
	 * judge category
	 * @param categoryString
	 * @return
	 */
	
	public static int getCategory(String categoryString) {
		int categoryInt;
		
		if(categoryString.equals("组织机构"))
			categoryInt = 1;
		else if(categoryString.equals("焦点新闻"))
			categoryInt = 2;
		else if(categoryString.equals("公告信息"))
			categoryInt = 3;
		else if(categoryString.equals("理论园地"))
			categoryInt = 4;
		else if(categoryString.equals("媒体报道"))
			categoryInt = 5;
		else if(categoryString.equals("下属组织"))
			categoryInt = 6;
		else if(categoryString.equals("下载专区"))
			categoryInt = 7;
		else if(categoryString.equals("内部机构"))
			categoryInt = 8;
		else if(categoryString.equals("书记室"))
			categoryInt = 9;
		else if(categoryString.equals("宣传思想"))
			categoryInt = 10;
		else if(categoryString.equals("基层动态"))
			categoryInt = 11;
		else {
			// incorrect input
			categoryInt = -1;
		}
		return categoryInt;
	}
}
