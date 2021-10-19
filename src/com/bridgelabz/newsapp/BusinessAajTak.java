package com.bridgelabz.newsapp;
/**
 * Needs data from subject class.
 * 
 * @author xfzxl
 */
public class BusinessAajTak implements IObserver {

	@Override
	public void onUpdate(News news) {
		System.out.println(news.news);		
	}

	@Override
	public News.NewsType getNewsType() {
		return News.NewsType.BUSINESS_NEWS;
	}
	
}
