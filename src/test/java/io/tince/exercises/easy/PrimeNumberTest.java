package io.tince.exercises.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberTest {

    @Test
    void givenPrimeNumber_whenCalculateIsPrime_thenReturnTrue() {
        // given
        int prime = 17;

        // when
        boolean result = PrimeNumber.isPrime(prime);

        // then
        assertTrue(result, "Result must be true");
    }

    @Test
    void givenNotPrimeNumber_whenCalculateIsPrime_thenReturnFalse() {
        // given
        int prime = 1;

        // when
        boolean result = PrimeNumber.isPrime(prime);

        // then
        assertFalse(result, "Result must be false");
    }
}