package in.giftcard.functionaltests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import in.giftcard.dao.BuyerDAO;
import in.giftcard.dao.OrderDAO;
import in.giftcard.dao.RecipientDAO;
import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;
import in.giftcard.service.BuyerServiceImpl;
import in.giftcard.service.OrderServiceImpl;
import in.giftcard.service.RecipientServiceImpl;
import in.giftcard.utiltestclass.MasterData;

public class TestFunctional {
	static{
		File file = new File("output_revised.txt");
		 if(file.exists()){
			 try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			
			}
		 }
	}
	@Mock
	private BuyerDAO buyerDao;
	@Mock
	private OrderDAO orderDao;
	@Mock
	private RecipientDAO recipientDao;

	@Mock
	private Buyer buyer;
	@Mock
	private Order order;
	@Mock
	private Recipient recipient;

	@InjectMocks
	private BuyerServiceImpl buyerServiceImpl;
	
	@InjectMocks
	private OrderServiceImpl orderServiceImpl;
	
	@InjectMocks
	private RecipientServiceImpl recipientServiceImpl;
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testSaveBuyer() throws Exception {
		int id=MasterData.getBuyerDetails().getBuyerId();
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveBuyer="+(id==0?true:false), true);
		
	}
	@Test
	public void testSaveOrder() throws Exception {
		int id=MasterData.getOrderDetails().getOrderId();
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveOrder="+(id==0?true:false), true);	}
	@Test
	public void testSaveRecipient() throws Exception {
		int id=MasterData.getRecipientDetails().getRecipientId();
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveRecipient="+(id==0?true:false), true);	
	}
	@Test
	public void testGetBuyer() throws Exception {
		buyer = buyerServiceImpl.getBuyer(MasterData.getBuyerDetails().getBuyerId());
		when(buyerDao.getBuyer(1)).thenReturn(null);
		Buyer res = buyerServiceImpl.getBuyer(1);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetBuyer="+(res!=null?true:false), true);	
		
	}
	@Test
	public void testGetOrder() throws Exception {
		order = orderServiceImpl.getOrderById(MasterData.getOrderDetails().getOrderId());
		when(orderDao.getOrderById(1)).thenReturn(null);
		Order res = orderServiceImpl.getOrderById(1);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetOrder="+(res!=null?true:false), true);
	}
	@Test
	public void testGetRecipient() throws Exception {
		recipient = recipientServiceImpl.getRecipientById(MasterData.getRecipientDetails().getRecipientId());
		when(recipientDao.getRecipientById(1)).thenReturn(null);
		Recipient res = recipientServiceImpl.getRecipientById(1);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetRecipient="+(res!=null?true:false), true);
	}	
	@Test
	public void testDeleteBuyer() throws Exception {
		Buyer buyer = buyerServiceImpl.getBuyer(MasterData.getBuyerDetails().getBuyerId());
		when(buyerDao.getBuyer(1)).thenReturn(buyer).thenReturn(null);
		Buyer res = buyerServiceImpl.getBuyer(1);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestDeleteBuyer="+(res!=null?true:false), true);
	}
	@Test
	public void testDeleteOrder() throws Exception {
		Order order = orderServiceImpl.getOrderById(MasterData.getOrderDetails().getOrderId());
		when(orderDao.getOrderById(1)).thenReturn(order).thenReturn(null);
		Order res = orderServiceImpl.getOrderById(1);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestDeleteOrder="+(res!=null?true:false), true);
	}
	@Test
	public void testDeleteRecipient() throws Exception {
		Recipient recipient = recipientServiceImpl.getRecipientById(MasterData.getRecipientDetails().getRecipientId());
		when(recipientDao.getRecipientById(1)).thenReturn(recipient).thenReturn(null);
		Recipient res = recipientServiceImpl.getRecipientById(1);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestDeleteRecipient="+(res!=null?true:false), true);
	}
}
