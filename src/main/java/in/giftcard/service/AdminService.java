package in.giftcard.service;

import java.util.List;

import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;

public interface AdminService {
	List<Buyer> listAllBuyers();
	List<Order> listAllOrders();
	List<Recipient> listAllRecipients();
	
	boolean deleteBuyerById(Integer buyerId);	
	boolean deleteOrderById(Integer orderId);	
	boolean deleteRecipientById(Integer recipientId);		
	boolean searchByStatus(Boolean status);
}
