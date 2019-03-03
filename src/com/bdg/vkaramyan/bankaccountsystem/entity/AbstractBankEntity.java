package com.bdg.vkaramyan.bankaccountsystem.entity;

import java.time.LocalDate;

public class AbstractBankEntity {

	protected int id;
	protected LocalDate createDate;
	protected LocalDate updateDate;
	protected LocalDate deleteDate;

	public AbstractBankEntity(int id) {

		this.id = id;
	}

	public int getId() {
		return id;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public LocalDate getDeleteDate() {
		return deleteDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public void setDeleteDate(LocalDate deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public String toString() {
		return "AbstractBankEntity [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", deleteDate=" + deleteDate + "]";
	}

}
