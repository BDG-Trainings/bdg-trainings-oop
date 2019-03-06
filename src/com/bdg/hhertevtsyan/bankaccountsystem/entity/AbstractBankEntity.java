package com.bdg.hhertevtsyan.bankaccountsystem.entity;

import java.time.LocalDate;

public abstract class AbstractBankEntity {
   protected int id;
   protected LocalDate createdDate;
   protected LocalDate updatedDate;

   public AbstractBankEntity (final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}
