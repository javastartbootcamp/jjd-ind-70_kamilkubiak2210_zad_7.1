package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {

        if (array.length == 0) {
            return false;
        }

        int number = 0;
        for (int i : array) {
            number = number * 10 + i;
        }

        int originalNumber = number;

        int reversedNumber = 0;
        while (originalNumber != 0) {
            reversedNumber = reversedNumber * 10 + originalNumber % 10;
            originalNumber /= 10;
        }
        return number == reversedNumber;
    }
}
