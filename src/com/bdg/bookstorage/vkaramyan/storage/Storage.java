package com.bdg.bookstorage.vkaramyan.storage;

public interface Storage {
	
	void storageSize(int size);
	
	Storage storage(int storageSize);
	Storage get(int currentStorageSize);

}
