package ru.netology.SQRService.ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldCalcExact1(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(min, max);

        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void shouldCalcExact2() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
   }

    @ParameterizedTest
    @CsvSource({
            "1,200,250",
            "6,200,400"
    })
    public void shouldCalcExact3(int expected, int min, int max) {

        SQRService service = new SQRService();

        int actual = service.calcSqr(min, max);

        Assertions.assertEquals(expected, actual);
        }

    }
