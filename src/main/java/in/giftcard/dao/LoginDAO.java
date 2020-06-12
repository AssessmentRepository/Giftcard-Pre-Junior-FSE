package in.giftcard.dao;

import in.giftcard.model.Buyer;

public interface LoginDAO {

	boolean register(Buyer Buyer);
	boolean login(String username,String password);
	boolean resetPassword(String username,String password);
}
