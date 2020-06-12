package in.giftcard.model;

import javax.persistence.Column;
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
@Entity(name = "Recipient")
public class Recipient {
	@Id
	@Column(name = "recipientId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recipientId;
	private String recipientFirstname;
	private String recipientLastname;
	private String recipientUsername;
	private String recipientPhoneno;	
	private String streetName;
	private String cityName;
	private String state;
	private String country;
	private String pincode;
	
}
