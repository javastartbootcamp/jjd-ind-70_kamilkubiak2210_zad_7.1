package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 2, 1};
        int[] array2 = new int[]{1, 2, 3, 1};
        int[] array3 = new int[]{1, 2, 3, 4, 3, 2};
        int[] array4 = null;
        int[] array5 = new int[]{1, 2, 1};

        boolean isPalindrome1 = PalindromeService.isPalindrome(array);
        boolean isPalindrome2 = PalindromeService.isPalindrome(array2);
        boolean isPalindrome3 = PalindromeService.isPalindrome(array3);
        boolean isPalindrome4 = PalindromeService.isPalindrome(array4);
        boolean isPalindrome5 = PalindromeService.isPalindrome(array5);

        System.out.println(isPalindrome1);
        System.out.println(isPalindrome2);
        System.out.println(isPalindrome3);
        System.out.println(isPalindrome4);
        System.out.println(isPalindrome5);
    }
}
