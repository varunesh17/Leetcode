public class Solution {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(121));   // Output: true
        System.out.println(isPalindrome(-121));  // Output: false
        System.out.println(isPalindrome(10));    // Output: false
    }

    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10; // Build the reversed number
            x /= 10; // Remove the last digit from x
        }

        // Check if the original number is equal to the reversed number
        // For odd-length numbers, we can ignore the middle digit by reversedNumber / 10
        return x == reversedNumber || x == reversedNumber / 10;
    }
}