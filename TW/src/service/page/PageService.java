package service.page;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.lucene.document.Document;
import org.apache.lucene.search.Hits;
import org.omg.CORBA.INTERNAL;

import bean.temp.ArticleTemp;

public class PageService {
	public static int PAGE_SIZE = 18;
	
	//get pageCount by hits's length
	public static int countPage(int counts) {
		int page;
		
		if(counts < PAGE_SIZE) {
			page = 1;
		}
		
		if(counts % PAGE_SIZE != 0) {
			page = (counts - (counts % PAGE_SIZE) ) /PAGE_SIZE + 1;
		}
		else {
			page = counts / PAGE_SIZE;
		}
		
		return page;
	}
	
	public static ArrayList<ArticleTemp> getArticleByPage(int currentPage, int pageCount,Hits hits){
		ArrayList<ArticleTemp> articles = new ArrayList<ArticleTemp>();
		
		int startIndex = (currentPage - 1) * PAGE_SIZE;
		int endIndex = startIndex + PAGE_SIZE;
		
		if(endIndex > hits.length())
			endIndex = hits.length();
		
		for (int i = startIndex; i < endIndex; i++) {
			Document doc;
			try {
				doc = hits.doc(i);
			
			ArticleTemp article = new ArticleTemp();
			article.setId(Integer.parseInt(doc.get("id")));
			article.setTitle(doc.get("title"));
			article.setCategory(doc.get("category"));
			article.setDate(doc.get("date"));
			articles.add(article);
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return articles;
	}
	
	
}
