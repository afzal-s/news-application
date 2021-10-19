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
		observerList.stream()
			.filter(observer -> observer != null)
			.forEach(observer -> observer.onUpdate(data));
	}

}
