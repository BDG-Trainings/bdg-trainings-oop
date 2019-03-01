package com.bdg.spapoyan.bankAccountSystem.entity;

import com.bdg.spapoyan.Date;

public abstract class AbstractBankEntity {

    protected int id;
    protected Date createdDate;
    protected Date updatedDate;

    public AbstractBankEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
