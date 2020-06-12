package in.giftcard.dao;

import in.giftcard.model.Order;

public interface OrderDAO {
	Integer createOrder(Order  order);
	Order getOrderById(Integer orderId);
	void updateOrderById(Integer orderId, Order order);
}
