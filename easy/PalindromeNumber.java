class Solution {
    public boolean PalindromeNumber(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;

        while (x > reversed){
            int lastDigit = x % 10;
            x /= 10;
            reversed = reversed * 10 + lastDigit;
        }

        return (reversed == x) || (reversed / 10 ==x);



        
    }
}