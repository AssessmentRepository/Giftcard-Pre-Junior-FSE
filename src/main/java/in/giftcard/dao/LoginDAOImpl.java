package in.giftcard.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.giftcard.model.Buyer;

@Repository
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean register(Buyer buyer) {
		return false;
	}

	public boolean login(String username, String password) {
		return false;
	}
	
	public boolean resetPassword(String username, String password) {
		return false;
	}
}
