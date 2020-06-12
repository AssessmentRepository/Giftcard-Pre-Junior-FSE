package in.giftcard.service;

import in.giftcard.model.Recipient;

public interface RecipientService {
	boolean createRecipient(Recipient  recipient);
	Recipient getRecipientById(Integer recipientId);
	boolean updateRecipientById(Integer recipientId, Recipient recipient);
}
