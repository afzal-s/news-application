package com.bridgelabz.newsapp;
public interface IObserver {
	public void onUpdate(News news);
	public News.NewsType getNewsType();
}
