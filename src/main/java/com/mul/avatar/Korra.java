package com.mul.avatar;

public class Korra implements Avatar{
	Element element;
	
	public Korra() {
	}
	
	public Korra(Element element) {
		this.element = element;
	}
	
	@Override
	public void doBending() {
		String action = element.getAction();
		System.out.println(this.toString()+" doing "+action);
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
	
	
}
