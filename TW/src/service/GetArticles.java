package service;

import java.util.ArrayList;
import java.util.List;

import dao.FileDao;
import dao.GenericArticleDao;

import bean.GenericArticle;

public class GetArticles {

	
	public  ArrayList<GenericArticle> getFiveNews(){
		GenericArticleDao genericArticleDao=new GenericArticleDao();
		
		//get all articles
		List<GenericArticle> articles=genericArticleDao.getAllEntity();
		
		//hold all news
		ArrayList<GenericArticle> news=new ArrayList<GenericArticle>();
		
		//hold newest news
		ArrayList<GenericArticle> fiveNews=new ArrayList<GenericArticle>();
		
//		//get all news
//		for(GenericArticle a:articles){
//			if(a.getCategory()== 1)
//
//				news.add(a);
//		}
//
//		// sort news
//		news = SortUtil.sort(news);
//
//		// get five newest news
//		if (news.size() < 5) {
//			for (int i = 0; i < news.size(); i++) {
//				fiveNews.add(news.get(news.size() - i - 1));
//			}
//		}
//
//		else {
//			for (int i = 0; i < 5; i++) {
//				fiveNews.add(news.get(news.size() - i - 1));
//			}
//
//		}
//
//		System.out.println("new l:" + fiveNews.size());
		
		fiveNews = genericArticleDao.getFiveArticles(1);
		return fiveNews;
	}

	public ArrayList<GenericArticle> getFiveMedias() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

//		// get all articles
//		List<GenericArticle> articles = genericArticleDao.getAllEntity();
//
//		// hold all medias
//		ArrayList<GenericArticle> medias = new ArrayList<GenericArticle>();
//
		ArrayList<GenericArticle> fiveMedias = new ArrayList<GenericArticle>();
//
//		
//		for(GenericArticle a:articles) {
//			if(a.getCategory()==5 || a.getCategory()==6 || a.getCategory()==7 || a.getCategory()==8 || a.getCategory()==9)
//
//				medias.add(a);
//
//		}
//
//		medias = SortUtil.sort(medias);
//
//		if (medias.size() < 5) {
//			for (int i = 0; i < medias.size(); i++) {
//				fiveMedias.add(medias.get(medias.size() - i - 1));
//
//			}
//		}
//
//		else {
//			for (int i = 0; i < 5; i++) {
//				fiveMedias.add(medias.get(medias.size() - i - 1));
//
//			}
//
//		}
//
//		System.out.println("media l:" + fiveMedias.size());
		fiveMedias = genericArticleDao.getFiveArticles(4);
		return fiveMedias;

	}

	public ArrayList<GenericArticle> getFiveInfos() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();
//
//		// get all articles
//		List<GenericArticle> articles = genericArticleDao.getAllEntity();
//
//		// hold all medias
//		ArrayList<GenericArticle> infos = new ArrayList<GenericArticle>();
//
		ArrayList<GenericArticle> fiveInfos = new ArrayList<GenericArticle>();
//
//		
//		for(GenericArticle a:articles) {
//			if(a.getCategory()==2)
//
//				infos.add(a);
//		}
//		infos = SortUtil.sort(infos);
//
//		if (infos.size() < 5) {
//			for (int i = 0; i < infos.size(); i++) {
//				fiveInfos.add(infos.get(infos.size() - i - 1));
//			}
//		} else {
//			for (int i = 0; i < 5; i++) {
//				fiveInfos.add(infos.get(infos.size() - i - 1));
//			}
//		}
//
//		System.out.println("info:" + fiveInfos.size());
		fiveInfos = genericArticleDao.getFiveArticles(2);
		return fiveInfos;
	}

	public ArrayList<GenericArticle> getFiveTheories() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

//		// get all articles
//		List<GenericArticle> articles = genericArticleDao.getAllEntity();
//
//		// hold all medias
//		ArrayList<GenericArticle> theories = new ArrayList<GenericArticle>();
//
		ArrayList<GenericArticle> fiveTheories = new ArrayList<GenericArticle>();
//
//		
//		for(GenericArticle a:articles) {
//			if(a.getCategory()==3)
//
//				theories.add(a);
//		}
//		theories = SortUtil.sort(theories);
//		if (theories.size() < 5) {
//			for (int i = 0; i < theories.size(); i++) {
//				fiveTheories.add(theories.get(theories.size() - i - 1));
//			}
//		} else {
//			for (int i = 0; i < 5; i++) {
//				fiveTheories.add(theories.get(theories.size() - i - 1));
//			}
//		}
//
//		System.out.println("ther l:" + fiveTheories.size());
		fiveTheories = genericArticleDao.getFiveArticles(3);
		return fiveTheories;
	}

	// get all news
	public ArrayList<GenericArticle> getAllNews() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all news
		ArrayList<GenericArticle> news = new ArrayList<GenericArticle>();

		// hold newest news
		ArrayList<GenericArticle> fiveNews = new ArrayList<GenericArticle>();

		// get all news
		for (GenericArticle a : articles) {
			if (a.getCategory() == 10 || a.getCategory() == 11)
				news.add(a);
		}

		// sort news
		news = SortUtil.sort(news);

		return news;

	}

	// get all infos
	public ArrayList<GenericArticle> getAllInfos() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all info
		ArrayList<GenericArticle> infos = new ArrayList<GenericArticle>();

		ArrayList<GenericArticle> fiveInfos = new ArrayList<GenericArticle>();

		for (GenericArticle a : articles) {
			if (a.getCategory() == 3)
				infos.add(a);
		}
		infos = SortUtil.sort(infos);

		return infos;
	}

	// get all medias
	public ArrayList<GenericArticle> getAllMedias() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all medias
		ArrayList<GenericArticle> medias = new ArrayList<GenericArticle>();

		ArrayList<GenericArticle> fiveMedias = new ArrayList<GenericArticle>();

		for (GenericArticle a : articles) {
			if (a.getCategory() == 5)
				medias.add(a);

		}

		medias = SortUtil.sort(medias);
		return medias;
	}

	// get all theories
	public ArrayList<GenericArticle> getAllThories() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all medias
		ArrayList<GenericArticle> theories = new ArrayList<GenericArticle>();

		ArrayList<GenericArticle> fiveTheories = new ArrayList<GenericArticle>();

		for (GenericArticle a : articles) {
			if (a.getCategory() == 4)
				theories.add(a);
		}
		theories = SortUtil.sort(theories);
		return theories;

	}

	public ArrayList<GenericArticle> getAllPublicNews() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all news
		ArrayList<GenericArticle> news = new ArrayList<GenericArticle>();

		// hold newest news
		ArrayList<GenericArticle> fiveNews = new ArrayList<GenericArticle>();

		// get all news
		for (GenericArticle a : articles) {
			if (a.getCategory() == 10)
				news.add(a);
		}

		// sort news
		news = SortUtil.revertSort(news);
		return news;
	}

	public ArrayList<GenericArticle> getAllDynamicNews() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all news
		ArrayList<GenericArticle> news = new ArrayList<GenericArticle>();

		// hold newest news
		ArrayList<GenericArticle> fiveNews = new ArrayList<GenericArticle>();

		// get all news
		for (GenericArticle a : articles) {
			if (a.getCategory() == 11)
				news.add(a);
		}

		// sort news
		news = SortUtil.revertSort(news);

		return news;
	}

	public ArrayList<GenericArticle> GetFivePicnews() {
		GenericArticleDao genericArticleDao = new GenericArticleDao();

		// get all articles
		List<GenericArticle> articles = genericArticleDao.getAllEntity();

		// hold all news
		ArrayList<GenericArticle> picnews = new ArrayList<GenericArticle>();

		// hold newest news
		ArrayList<GenericArticle> fivePicNews = new ArrayList<GenericArticle>();

		// get all news
		for (GenericArticle a : articles) {
			if (a.isIshaveimage() == true)
				picnews.add(a);
		}

		picnews = SortUtil.sort(picnews);
		if (picnews.size() < 5) {
			for (int i = 0; i < picnews.size(); i++) {
				fivePicNews.add(picnews.get(picnews.size() - i - 1));
			}
		} else {
			for (int i = 0; i < 5; i++) {
				fivePicNews.add(picnews.get(picnews.size() - i - 1));
			}
		}

		return fivePicNews;

	}

	public static void main(String[] args) {
		ArrayList<GenericArticle> five = new GetArticles().getFiveNews();
		for (GenericArticle article : five) {
			System.out.println(article.getId() + ":" + article.getDate() + ":"
					+ article.getTitle());
		}

	}

}
