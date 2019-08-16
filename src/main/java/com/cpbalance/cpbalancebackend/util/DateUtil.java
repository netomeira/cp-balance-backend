package com.cpbalance.cpbalancebackend.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static LocalDateTime parseLocalDate(String dataString){
        return LocalDateTime.parse(dataString, DATE_FORMATTER);
    }

    public static LocalDateTime parseLocalDate(LocalDateTime data){
        return LocalDateTime.parse(data.format(DATE_FORMATTER), DATE_FORMATTER);
    }

}
