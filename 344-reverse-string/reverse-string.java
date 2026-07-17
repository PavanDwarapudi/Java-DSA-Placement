class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right) {
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
    }
}
}

 // Time Complexity - O(n) - as there are n/2 iterations for those pointers!!
    // Space Complexity - O(1) - as we create 3 variables(those can handles any numbers)
    // First pointer at start
    // Secomd pointer at last index
    // Using "temp" variable we interchange there values