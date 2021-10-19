/**
 * Needs data from subject class.
 * 
 * @author xfzxl
 */
public class Observer3 implements IObserver {

	@Override
	public void onUpdate(String data) {
		System.out.println(data + " recived in observer three.");		
	}
	
}
