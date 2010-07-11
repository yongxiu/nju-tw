package test;

import java.util.ArrayList;
import java.util.Date;

import dao.BrandDao;
import dao.CategoryDao;
import dao.FileDao;
import dao.GenericArticleDao;
import dao.IWorkDao;
import dao.TopicImageDao;
import dao.UserDao;

import bean.Brand;
import bean.Category;
import bean.File;
import bean.GenericArticle;
import bean.IWork;
import bean.TopicImage;
import bean.User;

public class TestDao {
	public static void main(String[] args) {
//		GenericArticleDao dao = new GenericArticleDao();
//		dao.delete(new Long(500));
//		
//		TopicImageDao dao1 = new TopicImageDao();
//		dao1.create(new TopicImage("a"));
//		IWorkDao brandDao = new IWorkDao();
//		IWork brand = new IWork("aa", "bb");
//		brandDao.create(brand);
//		UserDao userDao = new UserDao();
//		User user = userDao.getById(new Long(1));
//		FileDao fileDao = new FileDao();
//		File file = new File("name", user, "path", true, new Date(), 1);
//		fileDao.create(file);
//		CategoryDao categoryDao = new CategoryDao();
//		Category category = new Category("ss", 122);
//		categoryDao.create(category);
		BrandDao brandDao = new BrandDao();
		Brand brand = new Brand("第二个品牌", "path");
		brandDao.create(brand);
		
	}
}
