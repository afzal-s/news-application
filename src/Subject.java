import java.util.ArrayList;
import java.util.List;

/**
 * Observable class
 * Provides Data
 * 
 * @author xfzxl
 */
public class Subject {
	
	List<IObserver> observerList = new ArrayList<IObserver>();
	
	public void register(IObserver observer) {
		observerList.add(observer);
	}
	
	public void unRegister(IObserver observer) {
		observerList.remove(observer);
	}
	
	public void update(String data) {
		for (IObserver observer : observerList) {			
			if (observer != null) {			
				observer.onUpdate(data);
			}
		}
	}

}
