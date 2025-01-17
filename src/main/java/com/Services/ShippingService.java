package com.Services;
import com.Entities.Order;

public class ShippingService {
	
	private double Shipping;
	
	public ShippingService(double shipping) {
		Shipping = shipping;
	}
	

	public double getShipping() {
		return Shipping;
	}


	public void setShipping(double shipping) {
		Shipping = shipping;
	}


	public double Shipping(Order order) {
		if (order.getBasic() < 100.00) {
			return 20.00;
		}
		else if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00){
			return 12.00;	
		}
		else {
			return 0.0;
		}
	}
}
