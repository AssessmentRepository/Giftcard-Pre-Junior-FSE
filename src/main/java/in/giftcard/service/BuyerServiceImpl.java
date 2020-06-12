package in.giftcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.giftcard.dao.BuyerDAO;
import in.giftcard.model.Buyer;
@Service("BuyerService")
public class BuyerServiceImpl implements BuyerService {
	@Autowired
	private BuyerDAO buyerDAO;

	@Override
	public boolean createBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Buyer getBuyer(Integer buyerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBuyer(Integer buyerId, Buyer buyer) {
		// TODO Auto-generated method stub
		return false;
	}
}
