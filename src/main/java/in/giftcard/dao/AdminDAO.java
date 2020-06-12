package in.giftcard.dao;

import java.util.List;

import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;

public interface AdminDAO {
	List<Buyer> listAllBuyers();
	List<Order> listAllOrders();
	List<Recipient> listAllRecipients();
	
	void deleteBuyerById(Integer buyerId);	
	void deleteOrderById(Integer orderId);	
	void deleteRecipientById(Integer recipientId);	
	
	Boolean searchOrderByStatus(Boolean status);
}
