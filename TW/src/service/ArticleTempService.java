package service;

import javax.swing.text.AbstractDocument.Content;

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
	
	public static void main(String[] args) {
		ArticleTempService service = new ArticleTempService();
		System.out.println(service.getIntroduce("搜索防守对方的身份上的积分多少方式登所发生的方式地方记方式大幅降低搜房上的发生的方式的发生大幅度所发生的方式"));
	}
}
