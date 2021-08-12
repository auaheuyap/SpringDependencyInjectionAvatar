package com.mul.avatar;

public class Aang implements Avatar {
	
	Element element;
	
	public Aang() {
	}
	
	public Aang(Element element) {
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
