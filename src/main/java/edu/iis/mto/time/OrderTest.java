package edu.iis.mto.time;

import org.joda.time.DateTimeUtils;
import org.junit.Test;

public class OrderTest {

    @Test(expected = OrderExpiredException.class)
    public void confirmExpiredDate() throws Exception {
        Order order = new Order();
        order.submit();
        DateTimeUtils.setCurrentMillisOffset((24+1)*60*60*1000);
        order.confirm();
    }
}