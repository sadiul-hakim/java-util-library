package org.dataManager;


import org.dataManager.pojo.Grain;
import org.dataManager.util.DateTimeUtility;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        ZonedDateTime dateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime = DateTimeUtility.nextGrainDate(dateTime, Grain.QUARTER_HOURLY);
        System.out.println(zonedDateTime);
        System.out.println(DateTimeUtility.nextGrainDate(zonedDateTime,Grain.QUARTER_HOURLY));
    }
}