package com.bdg.agalayan.bankAccountSystem.entity;

import java.time.LocalDate;

public abstract class AbstractBankEntity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;
    protected LocalDate deletedDate;


    //
    AbstractBankEntity(int id) {
        this.id = id;

    }

    //We don't need a getter setter in this abstract class
    //It should be provided by child classes.
    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getDeletedDate() {
        return deletedDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setDeletedDate(LocalDate deletedDate) {
        this.deletedDate = deletedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
