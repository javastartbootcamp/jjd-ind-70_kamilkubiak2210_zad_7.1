package pl.javastart.task;

public class PalindromeService {
    public static boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

