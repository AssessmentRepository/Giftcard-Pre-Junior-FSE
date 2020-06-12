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
@Entity(name = "Buyer")
public class Buyer {	
		@Id
		@Column(name = "buyerId")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer buyerId;
		private String buyerFirstname;
		private String buyerLastname;
		private String buyerName;
		private String password;
		private String buyerPhoneno;
		private String buyerEmail;		
}
