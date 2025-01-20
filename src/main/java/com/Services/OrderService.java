package com.Services;
import org.springframework.stereotype.Service;
import com.Entities.Order;

@Service
public class OrderService {
	
	public double Total(Order order,  ShippingService shippingService) {
		double shippingCost = shippingService.Shipping(order);
		return (order.getBasic() - (order.getBasic()* order.getDiscount()/ 100)) + shippingCost;
	}
	
}


