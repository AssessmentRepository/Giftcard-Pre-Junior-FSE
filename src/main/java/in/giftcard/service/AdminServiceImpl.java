package in.giftcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.giftcard.dao.AdminDAO;
import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO adminDAO;
	@Override
	public List<Buyer> listAllBuyers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> listAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipient> listAllRecipients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBuyerById(Integer buyerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRecipientById(Integer recipientId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchByStatus(Boolean status) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
