import java.lang.ref.WeakReference;

public class WeakReferences {

	public static void main(String[] args) {
		
		//strong reference
		Order ord = new Order(1, 20, 30);
		ord.displayQ();
		
		//creating weak reference
		WeakReference<Order> weakref = new WeakReference<Order>(ord);
		
		//object eligible for garbage collection.But will be garbage collected
		//when JVM needs memory
		ord = null;
		
		//retrieve back the object and call the method
		ord = weakref.get();
		
		System.out.println("Displaying quantity after retrieving the object");
		
		ord.displayQ();
		
	}

}
