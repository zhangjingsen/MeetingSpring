package com;

public class President {
	private String message;
	private Manuscript m;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Manuscript getM() {
		return m;
	}
	public void setM(Manuscript m) {
		this.m = m;
	}
	
	public void speech(){
		System.out.println("´ó¼ÒºÃ,"+getMessage());
		getM().write();
	}
}
