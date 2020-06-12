package in.giftcard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "OrderDetails")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private String buyerFirstName;
	private String buyerLastName;
	private String recipientFirstName;
	private String recipienLastName;
	private Long giftAmount;
	private String phoneNumber;
	private String email;
	private Boolean status=true;
	private String streetName;
	private String cityName;
	private String state;
	private String country;
	private String pincode;
}
