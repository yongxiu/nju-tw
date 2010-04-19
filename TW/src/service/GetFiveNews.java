package service;

import java.util.ArrayList;
import java.util.List;

import dao.GenericArticleDao;

import bean.GenericArticle;

public class GetFiveNews {
	
	public ArrayList<GenericArticle> getFiveNews(){
		GenericArticleDao genericArticleDao=new GenericArticleDao();
		
		//get all articles
		List<GenericArticle> articles=genericArticleDao.getAllEntity();
		
		//hold all news
		ArrayList<GenericArticle> news=new ArrayList<GenericArticle>();
		
		//hold newest news
		ArrayList<GenericArticle> fiveNews=new ArrayList<GenericArticle>();
		
		//get all news
		for(GenericArticle a:articles){
			if(a.getCategory()==0)
				news.add(a);
		}
		
		//sort news
		news=SortUtil.sort(news);
		
		//get five newest news
		for(int i=0;i<5;i++){
			fiveNews.add(news.get(news.size()-i-1));
		}
		
		return  fiveNews;
	}
	
	public static void main(String[] args){
		ArrayList<GenericArticle> five=new GetFiveNews().getFiveNews();
		for(GenericArticle article:five){
			System.out.println(article.getId()+":"+article.getDate());
		}
	}
	
	
}	
