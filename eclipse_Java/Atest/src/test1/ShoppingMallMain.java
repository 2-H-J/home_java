package test1;

public class ShoppingMallMain {

	public static void main(String[] args) {
		ShoppingMall sm = new ShoppingMall();
		
		sm.orderNumber = "201803120001";
		sm.orderId = "abc123";
		sm.orderDate = "2018년 3월 12일";
		sm.orderName = "홍길순";
		sm.orderProductNumber = "PD0345-12";
		sm.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		sm.orderInfo();
	}

}
