package in.giftcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.giftcard.model.Recipient;
import in.giftcard.service.RecipientService;
@Controller
@RequestMapping("/Recipient")
public class RecipientController {
	@Autowired
	RecipientService service;

	@GetMapping("/addrecipient")
	public String saveRecipient(@RequestBody Recipient recipient) {
		return "redirect:/recipient/list";
	}

	@GetMapping("/recipient/{id}")
	public String getRecipientById(@PathVariable("id") Integer recipientId) {
		return "recipient";
	}

	@GetMapping("/updaterecipient/{id}")
	public String updateRecipientById(@PathVariable("id") Integer recipientId,
			@RequestBody Recipient recipient) {
		return "recipient";
	}
}
