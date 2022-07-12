package com.asja.corewall.common.util;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-06-28 20:34
 */

public class TImeUtil {

    public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);

    public static Long getTimeNow(){
        return System.currentTimeMillis();
    }

    public static Long getTimeBeforeWeek(){
        return getTimeNow() - 7*24*60*60*1000;
    }

    public static Long getTimeBeforeMonth(){
        return getTimeNow() - 30L *24*60*60*1000;
    }

    public static Long getTimeBeforeYear(){
        return getTimeNow() - 365L *24*60*60*1000;
    }

    public static String getTimeStringByLong( long l){
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault());
        return localDateTime.format(DATE_TIME_FORMATTER);
    }


}
