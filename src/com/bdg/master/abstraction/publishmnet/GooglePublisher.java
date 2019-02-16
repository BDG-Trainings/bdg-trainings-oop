package com.bdg.master.abstraction.publishmnet;


import java.sql.SQLException;

public final class GooglePublisher extends Publisher {

    private GoogleDriver driver;



    @Override
    public void doPublish(final Placement placement) throws SQLException {
        super.record(placement);
        driver.publish(placement.toString());
    }
}
