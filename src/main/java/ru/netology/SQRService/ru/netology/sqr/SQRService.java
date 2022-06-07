
package ru.netology.SQRService.ru.netology.sqr;

public class SQRService {

    public int calcSqr(int min, int max) {
        int calcSqr = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                calcSqr = calcSqr + 1;

            }
        }
        return calcSqr;

    }

}