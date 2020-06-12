package in.giftcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.giftcard.model.Buyer;
import in.giftcard.service.BuyerService;

@Controller
@RequestMapping("/Buyer")
public class BuyerController {
	@Autowired
	BuyerService service;
	
	@GetMapping("/signup")
	public String saveBuyer(@RequestBody Buyer buyer) {
		return "redirect:/buyer/list";		
	}

	@GetMapping("/buyer/{id}")
	public String getBuyerById(@PathVariable("id") Integer buyerId) {
		return "buyer";		
	}

	@GetMapping("/updatebuyer/{id}")
	public String updateBuyerById(@PathVariable("id") Integer buyerId, @RequestBody Buyer buyer) {
		return "buyer";		
	}
}
