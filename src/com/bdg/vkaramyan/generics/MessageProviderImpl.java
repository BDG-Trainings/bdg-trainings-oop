package com.bdg.vkaramyan.generics;

public class MessageProviderImpl <T extends MessageProvider> {
	
	private  T t;

	public MessageProviderImpl(T t) {
		
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("Vika");
	}

}
