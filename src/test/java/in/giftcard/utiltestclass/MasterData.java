package in.giftcard.utiltestclass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import in.giftcard.model.Buyer;
import in.giftcard.model.Order;
import in.giftcard.model.Recipient;

public class MasterData {
	public static Buyer getBuyerDetails() {
		Buyer buyer = new Buyer();
		buyer.setBuyerId(1);
		buyer.setBuyerFirstname("Besta");
		buyer.setBuyerLastname("Chandrashekar");
		buyer.setBuyerName("B Chandrashekar");
		buyer.setPassword("Password");
		buyer.setBuyerPhoneno("9491993236");
		buyer.setBuyerEmail("chandu@gmail.com");
		return buyer;
	}
	public static Order getOrderDetails() {
		Order order = new Order();
		order.setOrderId(1);
		order.setBuyerFirstName("B");
		order.setBuyerLastName("Manaiah");
		order.setRecipientFirstName("Fname");
		order.setRecipienLastName("Lastname");
		order.setGiftAmount(20L);
		order.setPhoneNumber("9494949494");
		order.setEmail("test@gmail.com");
		order.setStatus(true);
		order.setStreetName("Dattagiricolony");
		order.setCityName("Zaheerabad");
		order.setState("Telangana");
		order.setCountry("India");
		order.setPincode("502220");	
		return order;
	}
	public static Recipient getRecipientDetails() {
		Recipient recipient=new Recipient();
		recipient.setRecipientId(1);
		recipient.setRecipientFirstname("Besta");
		recipient.setRecipientLastname("Shashidhar");
		recipient.setRecipientUsername("B Shashidhar");
		recipient.setRecipientPhoneno("9494879694");
		recipient.setStreetName("Dattagiricolony");
		recipient.setCityName("Zaheerabad");
		recipient.setState("Telangana");
		recipient.setCountry("India");
		recipient.setPincode("502220");			
		return recipient;
	}
	public static Properties getProperties() throws IOException {
		FileReader reader = new FileReader("src/main/resources/db.properties");
		Properties properties = new Properties();
		properties.load(reader);
		return properties;
	}
	
	public static LocalSessionFactoryBean getSession() throws IOException {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		Properties properties = getProperties();
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(properties.getProperty("database.driver"));
		dataSource.setUrl(properties.getProperty("database.url"));
		dataSource.setUsername(properties.getProperty("database.root"));
		dataSource.setPassword(properties.getProperty("database.password"));
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan("com.giftCard.entity");
		properties.put("hibernate.dialect", properties.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", properties.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", properties.getProperty("hibernate.show_sql"));
		lsfb.setHibernateProperties(properties);
		try {
			lsfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lsfb;
	}
}