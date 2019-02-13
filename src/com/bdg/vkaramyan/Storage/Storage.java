package com.bdg.vkaramyan.Storage;

public abstract class Storage {
	
	protected int storageSize;

	
	
	public Storage(int storageSize) {
		super();
		this.storageSize = storageSize;
	}



	public abstract int getCurrentStorageSize();

}
