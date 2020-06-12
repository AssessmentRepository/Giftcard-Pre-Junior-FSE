package in.giftcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.giftcard.dao.RecipientDAO;
import in.giftcard.model.Recipient;

@Service("RecipientService")
public class RecipientServiceImpl implements RecipientService {
	@Autowired
	private RecipientDAO recipientDAO;

	public boolean createRecipient(Recipient recipient) {
		// TODO Auto-generated method stub
		return false;
	}

	public Recipient getRecipientById(Integer recipientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateRecipientById(Integer recipientId, Recipient recipient) {
		// TODO Auto-generated method stub
		return false;

	}

}
