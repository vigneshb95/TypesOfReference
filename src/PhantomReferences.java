import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferences {

	public static void main(String[] args) {
		
		//strong reference
		Order ord = new Order(1, 20, 30);
		ord.displayQ();
		
		//creating reference queue
		ReferenceQueue<Order> refq = new ReferenceQueue<Order>();
		
		//creating phantom reference
		PhantomReference<Order> phantomRef = null;
		
		phantomRef = new PhantomReference<Order>(ord, refq);
		
		//object eligible for garbage collection.But it is kept in 'refq' before
		//removing from memory
		ord = null;
		
		//returns null because finalize() method is called before putting into 
		//reference queue
		ord = phantomRef.get();
		
		//returns null pointer exception
		ord.displayQ();
		
	}

}
