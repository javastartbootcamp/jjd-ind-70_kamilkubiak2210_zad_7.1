package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = new int[]{1, 2, 3, 2, 1};
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = new int[]{1, 2, 3, 4, 3, 2};
        int[] array4 = null;

        boolean isPalindrome1 = palindromeService.isPalindrome(array);
        boolean isPalindrome2 = palindromeService.isPalindrome(array2);
        boolean isPalindrome3 = palindromeService.isPalindrome(array3);
        boolean isPalindrome4 = palindromeService.isPalindrome(array4);

        System.out.println(isPalindrome1);
        System.out.println(isPalindrome2);
        System.out.println(isPalindrome3);
        System.out.println(isPalindrome4);
    }
}
