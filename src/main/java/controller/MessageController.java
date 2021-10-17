package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Message;
import service.MessageService;

@CrossOrigin
@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	MessageService ms;

	@RequestMapping("/all")
	public ArrayList<Message> getAll() {
		return ms.getAll();
	}

	@RequestMapping("{id}")
	public Message getMessage(@PathVariable("id") String id) {
		return ms.getMessage(id);
	}
}

