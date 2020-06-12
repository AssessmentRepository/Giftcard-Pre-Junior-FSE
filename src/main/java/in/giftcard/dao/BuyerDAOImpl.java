package in.giftcard.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.giftcard.model.Buyer;
@Repository
public class BuyerDAOImpl implements BuyerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer createBuyer(Buyer buyer) {
		return 0;
	}

	public Buyer getBuyer(Integer buyerId) {
		return null;
	}

	public void updateBuyerById(Integer buyerId, Buyer buyer) {
		
	}
}
