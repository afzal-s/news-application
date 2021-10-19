/**
 * Needs data from subject class.
 * 
 * @author xfzxl
 */
public class Observer2 implements IObserver {
	
	@Override
	public void onUpdate(String data) {
		System.out.println(data + " recived in observer two.");
	}
	
}
