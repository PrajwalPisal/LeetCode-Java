//Author: Prajwal Pisal
//Date: 03/07/2022
//File Name: PalindromeNumber.java
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int reminder = 0;
        int reverse = 0;
        int og = x;
        while (x > 0){
            reminder = x%10;
            reverse = reverse*10+reminder;
            x /= 10;
        }
        return og == reverse;
    }
}