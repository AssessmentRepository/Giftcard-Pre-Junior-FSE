package in.giftcard.dao;
import in.giftcard.model.Recipient;

public interface RecipientDAO {
	Integer createRecipient(Recipient  recipient);
	Recipient getRecipientById(Integer recipientId);
	void updateRecipientById(Integer recipientId,Recipient recipient);
}
