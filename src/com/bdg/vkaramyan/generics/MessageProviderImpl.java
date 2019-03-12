package com.bdg.vkaramyan.generics;


public class MessageProviderImpl <T> implements MessageProvider<String, StringBuilder, StringBuffer> {
	
	
	
	@Override
	public String getMessage() {
		
		StringBuffer strBuffer = new StringBuffer(this.getMessage());
		strBuffer.append("New Message");
	
		return strBuffer.toString();
	}
	
	
	public static void main(String[] args) {
		
		String str = "New message";
		
	    StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str);
		System.out.println("Message:" + str);
		
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.println("Message:" + str);
		
		
	}

}
