package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcSurviceTest {
    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    void shouldCalculate(int income, int expenses, int threshold, int expected) {
        CalcSurvice survice = new CalcSurvice();

        int actual = survice.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}