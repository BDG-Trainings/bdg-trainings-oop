package com.bdg.master.abstraction.publishmnet;


import java.sql.SQLException;

public final class FacebookPublisher extends Publisher {

    private FacebookDriver driver;

    @Override
    public void doPublish(final Placement placement) throws SQLException {
        super.record(placement);
        driver.publish(placement.toString());
    }
}
