package in.giftcard.testboundary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;
import in.giftcard.utiltestclass.MasterData;

public class TestBoundary {
	static {
		File file = new File("output_boundary_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();

			}
		}
	}

	@Test
	public void testBuyerNameLength() throws Exception {

		Buyer buyer = MasterData.getBuyerDetails();
		buyer.getBuyerName();
		int maxChar = 5;
		boolean usernameLength = ((buyer.getBuyerName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestBuyerNameLength=" + (usernameLength ? true : false), true);

	}

	@Test
	public void testPincodeNumber() throws Exception {
		Recipient recipient = MasterData.getRecipientDetails();
		recipient.getPincode();
		int pin = 6;
		boolean pincode = ((recipient.getPincode().length()) == pin);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestPincodeNumber=" + (pincode ? true : false), true);

	}

	@Test
	public void testOrderId() throws Exception {
		Order order = MasterData.getOrderDetails();
		order.getOrderId();
		int maxChar = 5;
		boolean id = ((order.getOrderId().SIZE) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestOrderId=" + (id ? true : false), true);

	}

	@Test
	public void testRecipientNameLength() throws Exception {
		Recipient recipient = MasterData.getRecipientDetails();
		recipient.getRecipientUsername();
		int maxChar = 5;
		boolean usernameLength = ((recipient.getRecipientUsername().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestRecipientNameLength=" + (usernameLength == true ? true : false), true);

	}

	@Test
	public void testPasswordLength() throws Exception {
		Buyer buyer = MasterData.getBuyerDetails();
		buyer.getPassword();
		int passwordLength = 8;
		boolean Length = ((buyer.getPassword().length()) >= passwordLength);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestPasswordLength=" + (Length == true ? true : false), true);

	}

	@Test
	public void testRecipientMobileNo() throws Exception {
		Recipient recipient = MasterData.getRecipientDetails();
		recipient.getRecipientPhoneno();
		int phoneLength = 10;
		boolean Length = (recipient.getRecipientPhoneno().length() >= phoneLength);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestRecipientMobileNo=" + (Length == true ? true : false), true);
	}
}