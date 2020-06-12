package in.giftcard.service;

import in.giftcard.model.Buyer;

public interface BuyerService {
	boolean createBuyer(Buyer  buyer);
	Buyer getBuyer(Integer buyerId);
	boolean updateBuyer(Integer buyerId, Buyer buyer);
}
