package test;

import java.util.ArrayList;

import dao.GenericArticleDao;
import dao.UserDao;

import bean.GenericArticle;

public class TestDao {
	public static void main(String[] args) {
		GenericArticleDao dao = new GenericArticleDao();
		dao.delete(new Long(500));
		
		
		
	}
}
