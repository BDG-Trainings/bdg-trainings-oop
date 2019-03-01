package com.bdg.hhertevtsyan.bankaccountsystem;

import java.util.Date;

public abstract class AbstractBankEntity {
   protected int id;
   protected Date createdDate;
   protected Date updatedDate;

   public AbstractBankEntity (final int id) {
       this.id = id;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
