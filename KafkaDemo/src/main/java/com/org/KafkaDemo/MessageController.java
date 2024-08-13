package com.org.KafkaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.KafkaDemo.repo.MessageRepo;

@RestController
public class MessageController {
	@Autowired
	private MessageProducer producer;
	
	@Autowired
	private MessageRepo repo;
	
	// send message to kafka
	   @GetMapping("/send")
	      public String sendMsg(
	      @RequestParam("msg") String message) {
	          producer.sendMessage(message);
	          return "" +"'+message +'" + " sent successfully!";
	      }
	
	//Read all messages
	@GetMapping("/getAll")
	public String getAllMessage() {
		return repo.getMessage();
	}
	
}
