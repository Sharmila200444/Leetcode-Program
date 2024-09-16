//CountDigits

class Solution{
    static int evenlyDivides(int N){
        int c=0;
        int t=N;
        
        while(t>0){
            int x=t%10;
            
           
            if (x!= 0 && N % x == 0 ) {
                
              c++;  
            }
             t/=10;
        }
        
        
            
        
        return c;
        
        // code here
    }
}

// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.
// Input: n = 2446
// Output: 1
// Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
// Input: n = 23
// Output: 0
// Explanation: 2 and 3, none of them divide 23 evenly.


//link:https://www.geeksforgeeks.org/problems/count-digits5716/1?page=4&sortBy=submissions
