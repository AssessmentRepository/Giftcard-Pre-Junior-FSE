package in.giftcard.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.giftcard.model.Recipient;

@Repository
public class RecipientDAOImpl implements RecipientDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Integer createRecipient(Recipient recipient) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Recipient getRecipientById(Integer recipientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateRecipientById(Integer recipientId, Recipient recipient) {
		// TODO Auto-generated method stub

	}

}
