package com;
//���Ը�
public class Manuscript {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void write(){
		System.out.println("����"+getMessage());
	}
	
}
