package com.am;

/**
 * Author:  Aye Maung
 *
 */
public final class Utils {

    public static boolean isPalindrome(int num) {
        String numStr = num + "";
        if (numStr.length() < 2) {
            return true;
        }

        int frontIndex = 0;
        int backIndex = numStr.length() - 1;

        while (frontIndex < backIndex) {
            if (numStr.charAt(frontIndex) != numStr.charAt(backIndex)) {
                return false;
            }

            frontIndex++;
            backIndex--;
        }

        return true;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
