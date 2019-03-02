package com.bdg.spapoyan.bankAccountSystem.entity;

import java.time.LocalDate;

public abstract class AbstractBankEntity {

    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;
    protected LocalDate deletedDate;

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
