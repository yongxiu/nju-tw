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
	
	public static String getCategory(int categoryId) {
		String category;
		if(categoryId == 1)
			category = "组织机构";
		else if(categoryId == 2)
				category = "焦点新闻";
		else if(categoryId == 3)
			category = "公告信息";
		else if(categoryId == 4)
			category = "理论园地";
		else if(categoryId == 5)
			category = "媒体报道";
		else if(categoryId == 6)
			category = "下属组织";
		else if(categoryId == 7)
			category = "下载专区";
		else if(categoryId == 8)
			category = "内部机构";
		else if(categoryId == 9)
			category = "书记室";
		else if(categoryId == 10)
			category = "宣传思想";
		else if(categoryId == 11)
			category = "基层动态";
		
		else {
			// incorrect input
			category = "incorret";
		}
		return category;
	}
}
