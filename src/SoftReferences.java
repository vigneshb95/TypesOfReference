import java.lang.ref.SoftReference;

public class SoftReferences {

	public static void main(String[] args) {
		
		//strong reference
		Order ord = new Order(1, 20, 30);
		ord.displayQ();
				
		//creating soft reference
		SoftReference<Order> softref = new SoftReference<Order>(ord);
				
		//object eligible for garbage collection.But will be garbage collected
		//when JVM runs out of memory
		ord = null;
				
		//retrieve back the object and call the method
		ord = softref.get();
		
		System.out.println("Displaying quantity after retrieving the object");
		
		ord.displayQ();
	}

}
