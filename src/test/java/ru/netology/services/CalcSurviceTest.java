package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcSurviceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parameters.csv")
    public void shouldCalculate(int income, int expenses, int threshold, int expected) {
        CalcSurvice survice = new CalcSurvice();

        int actual = survice.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}