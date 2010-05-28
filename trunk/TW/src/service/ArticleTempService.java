package service;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.AbstractDocument.Content;

import dao.GenericArticleDao;
import dao.UserDao;

import bean.GenericArticle;
import bean.User;
import bean.temp.ArticleTemp;

public class ArticleTempService {

	public String getIntroduce(String content) {
		String introduce = null;
		if(content.length()>=24) {
			introduce  = content.substring(0, 24);
			introduce = introduce+"...";
		}
		else {
			introduce = content;
		}
		return introduce;
	}
	
	public String getTitle(String input) {
		String title = null;
		if(input.length()>=24) {
			title = input.substring(0,24);
		}
		else {
			title = input;
		}
		return title;
	}
	
	public ArrayList<ArticleTemp> getAllArticleTemps(){
		ArrayList<ArticleTemp> articleTemps;
		ArrayList<GenericArticle> articles;
		articleTemps = new ArrayList<ArticleTemp>();
		GenericArticleDao articleDao =  new GenericArticleDao();
		articles = (ArrayList<GenericArticle>) articleDao.getAllEntity();
		
		
		//sort articles by date
		articles = SortUtil.revertSort(articles);
		
		//clone generic article to aritcleTemp
		for(GenericArticle a : articles) {
			ArticleTemp aTemp = new ArticleTemp();
			aTemp.setCategory(Category.getCategory(a.getCategory()));
			aTemp.setDate(a.getDate().toString());
			aTemp.setId((int) a.getId());
			aTemp.setTitle(a.getTitle());
			aTemp.setTopid(a.getTopic());
			articleTemps.add(aTemp);
		}
		
		return articleTemps;
	}
	
	public static void main(String[] args) {
		ArticleTempService service = new ArticleTempService();
		//System.out.println(service.getIntroduce("搜索防守对方的身份上的积分多少方式登所发生的方式地方记方式大幅降低搜房上的发生的方式的发生大幅度所发生的方式"));
		ArrayList<ArticleTemp> articles = service.getAllArticleTemps();
		System.out.println(articles.size());
	}
}
