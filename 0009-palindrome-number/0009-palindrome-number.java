//Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Also, if the last digit is 0 and the number 
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // When the length is even, x == reversed
        // When the length is odd, we get rid of the middle digit using reversed / 10
        return x == reversed || x == reversed / 10;
    }
}