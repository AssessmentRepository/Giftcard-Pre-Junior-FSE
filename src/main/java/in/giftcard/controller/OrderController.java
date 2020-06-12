package in.giftcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.giftcard.model.Order;
import in.giftcard.service.OrderService;
@Controller
@RequestMapping("/Order")
public class OrderController {
	@Autowired
	OrderService service;
	
	@GetMapping("/addorder")
	public String saveOrder(@RequestBody Order order) {
		return "redirect:/order/list";		
	}

	@GetMapping("/order/{id}")
	public String getOrderById(@PathVariable("id") Integer orderId) {
		return "order";		
	}
}
