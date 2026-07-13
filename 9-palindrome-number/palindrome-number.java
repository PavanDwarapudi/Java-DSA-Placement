class Solution {
    public boolean isPalindrome(int x) {
        //Time Complexity - O(log10 n)
        
        //Because algorithm needs to know number of digits in the given integer, for that digits=floor(log10 n)+1, the reason is at line 12 each digit is disappearing, for that d/2 iterations should done and for that we need to know the number of digits.

        //Optimal Solution
       if(x<0 || x%10==0 && x!=0) {
        return false;
       }
       int reversedHalf = 0;
       while(x>reversedHalf) {
       reversedHalf = reversedHalf*10+x%10;
       x=x/10;
       }
       return x==reversedHalf || x==reversedHalf/10;
    }
}