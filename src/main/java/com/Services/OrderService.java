package com.Services;
import com.Entities.Order;

public class OrderService {
	
	public double Total(Order order,  ShippingService shippingService) {
		double shippingCost = shippingService.Shipping(order);
		return (order.getBasic() - (order.getBasic()* order.getDiscount()/ 100)) + shippingCost;
	}
	
}


