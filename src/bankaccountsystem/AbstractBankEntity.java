package bankaccountsystem;

import com.bdg.osahakyan.date.Date;

import java.time.LocalDate;

public abstract class AbstractBankEntity {

    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;
    protected LocalDate deletedDate;

    public AbstractBankEntity(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreateData() {
        return createdDate;
    }
    public void setCreateData(LocalDate createData) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDate getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDate deletedDate) {
        this.deletedDate = deletedDate;
    }
}
