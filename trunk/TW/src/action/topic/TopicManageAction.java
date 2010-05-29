package action.topic;

import java.util.ArrayList;

import service.ArticleTempService;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.GenericArticleDao;
import dao.TopicImageDao;

public class TopicManageAction extends ActionSupport{
		private int topicid;
		private int isnew;
		
		private String img;

		private ArrayList<ArticleTemp> articles;
		
		public String execute() {
			TopicImageDao dao = new TopicImageDao();
			this.setImg(dao.getById(topicid).getPath());
			
			ArticleTempService articleTempService = new ArticleTempService();
			
			//old
			if(getIsnew() == 0) {
				articles = articleTempService.getAllArticleTemps();
			
				for(ArticleTemp a:articles) {
					if(a.getTopid() == topicid) {
						a.setChecked(1);
					}
					else {
						a.setChecked(0);
					}
				}
			}
		
			//new
			else {
				articles = articleTempService.getAllArticleTemps();
			}
			return SUCCESS;
		}

		public int getTopicid() {
			return topicid;
		}

		public void setTopicid(int topicid) {
			this.topicid = topicid;
		}

		public int getIsnew() {
			return isnew;
		}

		public void setIsnew(int isnew) {
			this.isnew = isnew;
		}

		public ArrayList<ArticleTemp> getArticles() {
			return articles;
		}

		public void setArticles(ArrayList<ArticleTemp> articles) {
			this.articles = articles;
		}

		public void setImg(String img) {
			this.img = img;
		}

		public String getImg() {
			return img;
		}

	

		
		
}
