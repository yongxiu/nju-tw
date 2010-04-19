package service;

import java.util.ArrayList;

import java.util.Date;

import bean.GenericArticle;

public class SortUtil {
	/**
	 * sort article by date wjc
	 * 
	 * @param articles
	 * @return
	 */
	public static ArrayList<GenericArticle> sort(
			ArrayList<GenericArticle> articles) {
		GenericArticle tempArticle;
		for (int i = 0; i < articles.size(); i++) {
			for (int j = 0; j < articles.size() - i - 1; j++) {
				if (gt(articles.get(j).getDate(), articles.get(j + 1).getDate())) {
					tempArticle = articles.get(j);
					articles.set(j, articles.get(j + 1));
					articles.set(j + 1, tempArticle);
				}

			}
		}
		return articles;
	}

	public static boolean gt(Date date1, Date date2) {

		if (date1.after(date2))
			return true;
		else
			return false;
	}

	

}
