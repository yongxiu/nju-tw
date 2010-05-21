package service;



import bean.GenericArticle;
import dao.GenericArticleDao;

public class ArticleService {
	public String getPureStringFromHtml(String content) {
		String result = null;
		result = content.replaceAll("<.*?>", "");
		
		result = result.replaceAll("&nbsp;", "");
		result = result.trim();
		return result;
	}
	
	
	public static void main(String[] args) {
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article = articleDao.getById(new Long(493));
		ArticleService articleService = new ArticleService();
		String output = articleService.getPureStringFromHtml(article.getContent());
		System.out.println(output);
	}
}
