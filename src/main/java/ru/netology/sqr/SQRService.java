package ru.netology.sqr;

public class SQRService {
    public int numberSQRInTheRange(int leftLimit, int rightLimit) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= leftLimit) {
                if (i * i <= rightLimit) {
                    count++;
                }
            }
        }

        return count;
    }
}
