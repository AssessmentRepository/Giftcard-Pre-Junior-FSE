package in.giftcard.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Buyer> listAllBuyers() {
		return null;
	}

	public List<Order> listAllOrders() {
		return null;
	}

	public List<Recipient> listAllRecipients() {
		return null;
	}

	public void deleteBuyerById(Integer buyerId) {

	}

	public void deleteOrderById(Integer orderId) {

	}

	public void deleteRecipientById(Integer recipientId) {

	}

	public Boolean searchOrderByStatus(Boolean status) {
		return null;
	}
}
