package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsOfRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testData.csv")
    /*@CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000",
    })*/
    public void calculateMonths(int expected, int income, int expenses, int threshold) {
        MonthsOfRestService service = new MonthsOfRestService();

        //int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
