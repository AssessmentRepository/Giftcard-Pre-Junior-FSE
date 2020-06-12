package in.giftcard.service;

import in.giftcard.model.Order;

public interface OrderService {
	boolean createOrder(Order order);
	Order getOrderById(Integer orderId);
	boolean updateOrderById(Integer orderId, Order order);
}
