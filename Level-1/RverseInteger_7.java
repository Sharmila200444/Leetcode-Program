class Solution {
    public int reverse(int x) {
        
        int c=0;
        while(x!=0){
            int xx=x%10;
            if(c>Integer.MAX_VALUE/10 || c<Integer.MIN_VALUE/10){
                return 0;
            }
            c=c*10+xx;
            x/=10;
        }
        return c; 
    }
    
}






 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// link:https://leetcode.com/problems/reverse-integer/description/