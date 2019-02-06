package com.bdg.master.abstraction.publishmnet;


import javax.sql.DataSource;
import java.sql.SQLException;

public abstract class Publisher {

    protected DataSource dataSource;

    public abstract void doPublish(Placement placement) throws SQLException;

    protected void record(final Placement placement) throws SQLException {
        dataSource.getConnection().createStatement().execute("insert into placement (name, description) values (" + placement.getDescription() + ")");
    }
}
