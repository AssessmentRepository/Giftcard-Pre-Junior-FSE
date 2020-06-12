package in.giftcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.giftcard.dao.OrderDAO;
import in.giftcard.model.Order;
@Service("OrderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDAO OrderDAO;
	public boolean createOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	public Order getOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateOrderById(Integer orderId, Order order) {
		return false;		
	}
}
