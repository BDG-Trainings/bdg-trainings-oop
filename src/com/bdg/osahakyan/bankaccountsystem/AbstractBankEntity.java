package com.bdg.osahakyan.bankaccountsystem;

import com.bdg.osahakyan.date.Date;

public abstract class AbstractBankEntity {

    protected int id;
    protected Date createDate;
    protected Date updateDate;

    public AbstractBankEntity(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateData() {
        return createDate;
    }
    public void setCreateData(Date createData) {
        this.createDate = createData;
    }

    public Date getUpdateData() {
        return updateDate;
    }
    public void setUpdateData(Date updateData) {
        this.updateDate = updateData;
    }


}
