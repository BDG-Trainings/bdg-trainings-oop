package com.bdg.vkaramyan.bankaccountsystem;

import java.util.Date;

public class AbstractBankEntity {

	protected int id;
	protected Date createDate;
	protected Date updateDate;

	public AbstractBankEntity(int id) {

		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "AbstractBankEntity [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

}
