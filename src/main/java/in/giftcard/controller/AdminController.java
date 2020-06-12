package in.giftcard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.giftcard.model.Order;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	@GetMapping("/buyers")
	public String listAllBuyers(Model theModel) {
		return "listBuyers";
	}
	@GetMapping("/orders")
	public String listAllOrders(Model theModel) {
		return "listOrders";
	}
	@GetMapping("/recipients")
	public String listAllRecipients(Model theModel) {
		return "listRecipients";
	}
	
	@GetMapping("/delbuyer/{id}")
	public String deleteBuyerById(@PathVariable("id") Integer buyerId) {
		return "redirect:/buyer/list";
	}
	
	@GetMapping("/delorder/{id}")
	public String deleteOrderById(@PathVariable("id") Integer orderId) {
		return "redirect:/order/list";		
	}
	@GetMapping("/delrecipient/{id}")
	public String deleteRecipientById(@PathVariable("id") Integer recipientId) {
		return "redirect:/recipient/list";	
	}
	@GetMapping("/orderstatus/{status}")
	public String searchOrderByStatus(@PathVariable("status")Boolean status) {
		return "order";
	}
	@GetMapping("/updorder/{id}")
	public String updateOrderById(@PathVariable("id") Integer orderId, @RequestBody Order order) {
		return "order";		
	}
}
