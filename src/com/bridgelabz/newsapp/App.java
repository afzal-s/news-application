package com.bridgelabz.newsapp;
import com.bridgelabz.newsapp.News.NewsType;

/**
 * Controller Layer
 * 
 * @author xfzxl
 */
public class App {
	
	public static void main(String[] args) {
		AajTak aajTak = new AajTak();
		MumbaiAajTak mumbaiAajTak = new MumbaiAajTak();
		DelhiAajTak delhiAajTak = new DelhiAajTak();
		BusinessAajTak businessAajTak = new BusinessAajTak();
		
		News news = new News();
		news.news = "Raining In Delhi";
		news.newsType = NewsType.DELHI_NEWS;
		
		News businessNews = new News();
		businessNews.news = "Sensex up by 2000 points";
		businessNews.newsType = NewsType.BUSINESS_NEWS;
		
		aajTak.register(mumbaiAajTak);
		aajTak.register(delhiAajTak);
		aajTak.register(businessAajTak);
		
		aajTak.update(businessNews);
	}
	
}
