package com.company.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateUtilityTest {

    @ParameterizedTest
    @CsvSource({
            "2023-07-21",
            "2020-02-29",
            "2021-03-31"
    })
    void givenDateInStringFormat_whenValidDates_thenShouldReturnTrue(String dateStr) {
        Assertions.assertThat(DateUtility.isValidDate(dateStr)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "2023/13/13",
            "2023-13-13",
            "9999-99-99"
    })
    void givenDateInStringFormat_whenInvalidDates_thenShouldReturnFalse(String dateStr) {
        Assertions.assertThat(DateUtility.isValidDate(dateStr)).isFalse();
    }

}
