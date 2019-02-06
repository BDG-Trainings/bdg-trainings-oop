package com.bdg.osahakyan.abstraction.publishmnet;


import javax.sql.DataSource;
import java.sql.SQLException;

public final class GooglePublisher extends Publisher {

    private GoogleDriver driver;



    @Override
    public void doPublish(final Placement placement) throws SQLException {
        super.record(placement);
        driver.publish(placement.toString());
    }
}
