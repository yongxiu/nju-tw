package service;

import java.util.ArrayList;

import java.util.Date;

import dao.GenericArticleDao;

import bean.GenericArticle;

import bean.File;

public class SortUtil {
	/**
	 * sort article by date wjc
	 * 
	 * @param articles
	 * @return
	 */
	//asc
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
	
	
	public static ArrayList<GenericArticle> revertSort(
			ArrayList<GenericArticle> articles) {
		ArrayList<GenericArticle> tempArticles = new ArrayList<GenericArticle>();
	
		articles = sort(articles);
		for(int i=0;i<articles.size();i++) {
			tempArticles.add(articles.get(articles.size()-1-i));
		}
		return tempArticles;
	}
	
	public static ArrayList<File> sortFile(
			ArrayList<File> files) {
		File tempFile;
		for (int i = 0; i < files.size(); i++) {
			for (int j = 0; j < files.size() - i - 1; j++) {
				if (gt(files.get(j).getDate(), files.get(j + 1).getDate())) {
					tempFile = files.get(j);
					files.set(j, files.get(j + 1));
					files.set(j + 1, tempFile);
				}

			}
		}
		return files;
	}
	
	
	public static ArrayList<File> revertSortFile(
			ArrayList<File> files) {
		ArrayList<File> tempFiles = new ArrayList<File>();
	
		files = sortFile(files);
		for(int i=0;i<files.size();i++) {
			tempFiles.add(files.get(files.size()-1-i));
		}
		return tempFiles;
	}

	public static boolean gt(Date date1, Date date2) {

		if (date1.after(date2))
			return true;
		else
			return false;
	}

	//test
	public static void main(String[] args){
		GenericArticleDao dao=new GenericArticleDao();
		GenericArticle a=dao.getById(new Long(1));
		System.out.println(a.getCategory());
	}

}
