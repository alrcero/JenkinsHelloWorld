package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import model.Message;

@Service
public class MessageService {
	ArrayList<Message> messages = new ArrayList<Message>();
	public MessageService() {
		Message p = new Message();
		p.setId("1");
		p.setMessage("Hello World !");
		messages.add(p);

		p = new Message();
		p.setId("2");
		p.setMessage("Hola Mundo !");
		messages.add(p);
	}
	public Message getMessage(String id) {
		for(Message message:messages) {
			if(message.getId().equalsIgnoreCase(id)) return message;
		}
	    return null;
	}
	public ArrayList<Message> getAll() {
		return messages;
	}
}

