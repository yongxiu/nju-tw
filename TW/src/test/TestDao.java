package test;

import java.util.ArrayList;

import dao.GenericArticleDao;
import dao.TopicImageDao;
import dao.UserDao;

import bean.GenericArticle;
import bean.TopicImage;

public class TestDao {
	public static void main(String[] args) {
//		GenericArticleDao dao = new GenericArticleDao();
//		dao.delete(new Long(500));
		
		TopicImageDao dao1 = new TopicImageDao();
		dao1.create(new TopicImage("a"));
		
		
	}
}
