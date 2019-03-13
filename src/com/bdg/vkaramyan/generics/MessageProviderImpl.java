package com.bdg.vkaramyan.generics;


//as you can see T is unused :)
public class MessageProviderImpl implements MessageProvider {
	
	
	
	@Override
	public String MessageProviderString() {
	
	
		return null;
	}
	
	@Override
	public StringBuffer MessageProviderStringBuffer() {
	
	
		return null;
	}
	
	@Override
	public StringBuilder MessageProviderStringBuilder() {
	
	
		return null;
	}
	
	public static void main(String[] args) {
		
		String str = "New Message";
		
		String string = new String();
		string.valueOf(str);
		System.out.println("Message is:" + str);
		
	    StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str);
		System.out.println("Message is:" + str);
		
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.reverse();
		System.out.println("Message is:" + str);
		
		
	}

}
