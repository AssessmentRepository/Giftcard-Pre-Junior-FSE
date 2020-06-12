package in.giftcard.dao;

import in.giftcard.model.Buyer;

public interface BuyerDAO {
	Integer createBuyer(Buyer buyer);
	Buyer getBuyer(Integer buyerId);
	void updateBuyerById(Integer buyerId,Buyer buyer);
}
