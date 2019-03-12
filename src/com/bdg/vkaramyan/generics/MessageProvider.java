package com.bdg.vkaramyan.generics;


//replace extends String, StringBuilder, StringBuffer with base type
//Base type should be parent for String, StringBuilder, StringBuffer

//Should provide 3 implementation for example MessageProviderString, MessageProviderStringBuffer, and MessageProviderStringBuffer
public interface MessageProvider <T extends String, StringBuilder, StringBuffer>{
	
		
	 String getMessage();

	
	
}
