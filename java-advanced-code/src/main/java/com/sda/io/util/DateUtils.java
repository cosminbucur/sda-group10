package com.sda.io.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    // TODO: implement test

    //        2019-08-4
    //        2019-08-14
    public static String convertLocalDateToString(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        String dateString = localDate.format(formatter);
        return dateString;
    }
}
