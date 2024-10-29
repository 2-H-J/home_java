package test1;

public class ShoppingMall {
		
	String orderNumber; // 주문번호
	String orderId; // 주문자 아이디
	String orderDate; // 주문 날짜
	String orderName; // 주문자 이름
	String orderProductNumber; // 주문 상품 번호
	String shippingAddress; // 배송주소
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderProductNumber() {
		return orderProductNumber;
	}
	public void setOrderProductNumber(String orderProductNumber) {
		this.orderProductNumber = orderProductNumber;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public void orderInfo() {
		System.out.printf("주문 번호 : %s\n주문자 아이디 : %s\n주문 날짜 : %s\n주문자 이름 : %s\n주문 상품 번호 : %s\n배송 주소 : %s\n",
				orderNumber, orderId, orderDate, orderName, orderProductNumber, shippingAddress);
	}

}
