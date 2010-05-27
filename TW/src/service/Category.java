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
		
		if(categoryString.equals("新闻动态"))
			categoryInt = 1;
		else if(categoryString.equals("公告信息"))
			categoryInt = 2;
		else if(categoryString.equals("理论园地"))
			categoryInt = 3;
		else if(categoryString.equals("媒体报道"))
			categoryInt = 4;
		else if(categoryString.equals("校外报道"))
			categoryInt = 5;
		else if(categoryString.equals("南大新闻网"))
			categoryInt = 6;
		else if(categoryString.equals("南京大学报"))
			categoryInt = 7;
		else if(categoryString.equals("南大青年报"))
			categoryInt = 8;
		else if(categoryString.equals("校园广播台"))
			categoryInt = 9;
		
		else {
			// incorrect input
			categoryInt = -1;
		}
		return categoryInt;
	}
	
	public static String getCategory(int categoryId) {
		String category;
		if(categoryId == 1)
			category = "新闻动态";
		else if(categoryId == 2)
				category = "公告信息";
		else if(categoryId == 3)
			category = "理论园地";
		else if(categoryId == 4)
			category = "媒体报道";
		else if(categoryId == 5)
			category = "校外报道";
		else if(categoryId == 6)
			category = "南大新闻网";
		else if(categoryId == 7)
			category = "南京大学报";
		else if(categoryId == 8)
			category = "南大青年报";
		else if(categoryId == 9)
			category = "校园广播台";
		
		
		else {
			// incorrect input
			category = "incorret";
		}
		return category;
	}
}
