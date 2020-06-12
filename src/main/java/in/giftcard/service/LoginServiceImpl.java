package in.giftcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.giftcard.dao.LoginDAO;
import in.giftcard.model.Buyer;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;

	public boolean register(Buyer buyer) {
		return false;
	}

	public boolean login(String userName, String password) {
		return false;
	}

	public boolean resetPassword(String userName, String password) {
		return false;
	}
}
