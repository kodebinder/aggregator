package com.company.util;

import com.company.constant.Constants;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Slf4j
public class DateUtility {

    private DateUtility() {
    }

    public static boolean isValidDate(String dateStr) {
        log.info("received dateStr: {}", dateStr);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.YYYY_MM_DD);
        try {
            LocalDate localDate = LocalDate.parse(dateStr, formatter);
            log.info("localDate: {}", localDate);
            return true;
        } catch (DateTimeParseException e) {
            log.error("Failed to parse date, exception: {}", e.getMessage());
            return false;
        }
    }

}
