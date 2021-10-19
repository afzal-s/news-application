/**
 * Controller Layer
 * 
 * @author xfzxl
 */
public class Main {
	
	public static void main(String[] args) {
		Observer1 observerObject1 = new Observer1();
		Observer2 observerObject2 = new Observer2();
		Observer3 observerObject3 = new Observer3();
		Subject subjectObject = new Subject();
		
		subjectObject.register(observerObject1);
		subjectObject.register(observerObject2);
		subjectObject.register(observerObject3);
		subjectObject.update("Registered");
		
		subjectObject.unRegister(observerObject1);
		subjectObject.unRegister(observerObject2);
		subjectObject.unRegister(observerObject3);
		subjectObject.update("Unregistered");
	}
	
}
