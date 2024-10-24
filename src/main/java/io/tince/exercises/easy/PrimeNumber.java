package io.tince.exercises.easy;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(3);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
