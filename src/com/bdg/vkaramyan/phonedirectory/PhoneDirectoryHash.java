package com.bdg.vkaramyan.phonedirectory;

import java.util.HashMap;


public class PhoneDirectoryHash {
	
	PhoneDirectory [] phoneDirectories;
	
	
		public String find (String name) {
			
			for(PhoneDirectory phoneDirectory : this.phoneDirectories) {
				if(phoneDirectory.getName() == name) {
					return name;
				}
			}
			return null;
		}
		
		public PhoneDirectory getNumber(String name) {
			
			
			return null;
			
		}
		
		public String putNumber(String name, String number) {
			return null;
			
		}
		
		public String removeContact(String name) {
			return name;
			
			
		}
		
		public static void main(String[] args) {
			HashMap<String, PhoneDirectory> phoneDirectory = new HashMap<>();
			phoneDirectory.get("John");
			
		}

}
