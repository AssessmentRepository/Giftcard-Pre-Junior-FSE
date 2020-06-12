package in.giftcard.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.giftcard.model.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Integer createOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order getOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateOrderById(Integer orderId, Order order) {
		// TODO Auto-generated method stub

	}

}
