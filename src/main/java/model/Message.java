package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	//Test comment added
	String id;
	String message;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
