package com.bdg.agalayan.bankAccountSystem.entity;

import java.time.LocalDate;

public abstract class AbstractBankEntity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;
    protected LocalDate deletedDate;



    AbstractBankEntity() {
        this.id = id;

    }



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
