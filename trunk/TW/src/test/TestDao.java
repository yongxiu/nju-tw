package test;

import java.util.ArrayList;

import dao.GenericArticleDao;

import bean.GenericArticle;

public class TestDao {
	public static void main(String[] args) {
		GenericArticleDao dao = new GenericArticleDao();
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) dao.getAllEntity();
		
		
	}
}
