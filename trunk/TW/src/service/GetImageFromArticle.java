package service;

import java.util.ArrayList;

import com.sun.corba.se.spi.orb.StringPair;

public class GetImageFromArticle {
	public static String KEYWORD = "UserFiles/Image/";
	
	public ArrayList<String> getImage(String content) {
		int fromIndex = 0;
		int end=0;
		ArrayList<String> images = new ArrayList<String>();
		String imageString;
		String temp;
		for (int i = 0; i < content.length();) {
			if(content.length()-i<16)
				break;
			
			temp = content.substring(i, i+16);
			if(temp.equals(KEYWORD)) {
				end = content.indexOf("\"", i);
				imageString = content.substring(i - 1, end + 1);
				imageString = "/TW/"+imageString.substring(1,imageString.length()-1);
				i = end + 1;
				images.add(imageString);
			}
			i++;
		}

		return images;
	}
	
	public static void main(String[] args) {
		System.out.println("abcde".substring(1,4));
	}

}


