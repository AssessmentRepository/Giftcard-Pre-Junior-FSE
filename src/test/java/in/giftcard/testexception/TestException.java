package in.giftcard.testexception;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import in.giftcard.exception.BuyerAlreadyExistException;
import in.giftcard.exception.BuyerDoesNotExistException;
import in.giftcard.model.Buyer;
import in.giftcard.service.LoginServiceImpl;


public class TestException  {
	static {
		File file = new File("output_exception_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_exception_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	@InjectMocks
	private LoginServiceImpl loginServiceImpl;
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test(expected = BuyerAlreadyExistException.class)
	public void testForBuyerRegistration() throws Exception {
		try {
		Buyer buyer = new Buyer();
		buyer.setBuyerId(1);
		buyer.setBuyerFirstname("Besta");
		buyer.setBuyerLastname("Chandrashekar");
		buyer.setBuyerName("B Chandrashekar");
		buyer.setPassword("Password");
		buyer.setBuyerPhoneno("9491993236");
		buyer.setBuyerEmail("chandu@gmail.com");
		loginServiceImpl.register(buyer);
		}
		catch(BuyerAlreadyExistException e)
		{
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForBuyerRegistration=true", true);
			throw e;
		}catch(Exception e)
		{
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForBuyerRegistration=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForBuyerRegistration=false", true);
	}
	@Test(expected = BuyerDoesNotExistException.class)
	public void testForBuyerLogin() throws Exception {
		try {
		Buyer buyer = new Buyer();
		buyer.setBuyerEmail("test@gmail.com");
		buyer.setPassword("Password");		
		loginServiceImpl.login(buyer.getBuyerName(), buyer.getPassword());
		
	}catch(BuyerDoesNotExistException e)
		{
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForBuyerLogin=true", true);
		throw e;
	}catch(Exception e)
	{
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForBuyerLogin=false", true);
		throw e;
	}
	File file = new File("output_exception_revised.txt");
	FileUtils.write(file, "\ntestForBuyerLogin=false", true);
}
}
