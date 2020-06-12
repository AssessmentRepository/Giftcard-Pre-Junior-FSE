package in.giftcard.service;

import in.giftcard.model.Buyer;

public interface LoginService {

	boolean register(Buyer Buyer);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
