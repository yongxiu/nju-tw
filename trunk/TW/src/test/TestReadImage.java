package test;

import bean.GenericArticle;
import bean.User;
import dao.GenericArticleDao;
import dao.UserDao;

public class TestReadImage {
	public static void main(String[] args){
	GenericArticleDao genericArticleDao=new GenericArticleDao();
	
	GenericArticle article=genericArticleDao.getById(new Long(491));
	System.out.println(article.getPath()+":"+article.isIshaveimage()+":"+article.isState());
	
	}
}
