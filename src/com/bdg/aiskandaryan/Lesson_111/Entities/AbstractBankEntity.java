package com.bdg.aiskandaryan.Lesson_111.Entities;

import java.time.LocalDate;

public abstract class AbstractBankEntity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;
    protected LocalDate deletedDate;

    public AbstractBankEntity(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCreatedDate(final LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(final LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDate getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(final LocalDate deletedDate) {
        this.deletedDate = deletedDate;
    }
}
