package com.bdg.vkaramyan.Storage;

import com.bdg.vkaramyan.entitys.Book;
import com.bdg.vkaramyan.resourceManagement.Department;

public final class BookStorage extends AbstractBookStorage{
	
	private int currentStorageSize = 0;

	public BookStorage(int storageSize) {
		super(storageSize);
	}

	@Override
	public Book store(Book book) {
		currentStorageSize++;
        bookStore[currentStorageSize] = book;
        return book;
	}

	@Override
	public boolean remove(Book book) {
		currentStorageSize--;
	
		public Department findDepartmentByName(String departmentName) {
			for (int i = 0; departments.length > i; i++) {
				if(departments[i].getDepartmentName() == departmentName) {
					department = departments[i];
				}
			}
		return false;
	}

	@Override
	public Book get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCurrentStorageSize() {
		return currentStorageSize;
	}

	
	

}
