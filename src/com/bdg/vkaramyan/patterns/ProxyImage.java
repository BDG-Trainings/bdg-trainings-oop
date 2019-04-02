package com.bdg.vkaramyan.patterns;

public class ProxyImage implements Image{
	
	public RealImage realImage;
	public String fileName;
	
	
	public ProxyImage(String fileName) {
		
		this.fileName = fileName;
		
	}


	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		
		realImage.display();
	}
	
	
}
