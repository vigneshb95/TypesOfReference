

public class Order {
	
	private int orderId;
	private int productId;
	private int quantity;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor
	public Order(int orderId, int productId, int quantity) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void displayQ() {
		
		System.out.println("Quantity : "+this.quantity);
		
	}
}
