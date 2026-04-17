package com.example;

public class NumberProcessor {
    public int processNumbers(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        return sumEven - sumOdd;
    }
}