/**
 * Needs data from subject class.
 * 
 * @author xfzxl
 */
public class Observer1 implements IObserver {
	
	@Override
	public void onUpdate(String data) {
		System.out.println(data + " recived in observer one.");
	}
	
}
