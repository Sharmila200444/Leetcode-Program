//Pascal Triangle


class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> l=new ArrayList<>();
        long s=1;
        for(int j=0; j<=rowIndex; j++){
            l.add((int)s);
            s=s*(rowIndex-j)/(j+1);
        }
        return l;
    }
}


// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]
// Example 3:

// Input: rowIndex = 1
// Output: [1,1]
 

//link:https://leetcode.com/problems/pascals-triangle-ii/description/
