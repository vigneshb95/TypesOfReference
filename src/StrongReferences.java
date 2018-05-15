
public class StrongReferences {

	public static void main(String[] args) {
		
		//strong reference - default type
		Order ord = new Order(1, 20, 30);
		ord.displayQ();
		
		//Object now eligible for garbage collection
		ord = null;
	}

}
