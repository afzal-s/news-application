package com.bridgelabz.newsapp;
import java.util.ArrayList;
import java.util.List;

/**
 * Observable class
 * Provides Data
 * 
 * @author xfzxl
 */
public class AajTak {
	
	List<IObserver> observerList = new ArrayList<IObserver>();
	
	public void register(IObserver observer) {
		observerList.add(observer);
	}
	
	public void unRegister(IObserver observer) {
		observerList.remove(observer);
	}
	
	public void update(News news) {
		observerList.stream()
			.filter(observer -> observer != null && observer.getNewsType() == news.newsType)
			.forEach(observer -> observer.onUpdate(news));
	}

}
