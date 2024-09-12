class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> ll=new ArrayList<>();
            int n=1;
            for(int j=0; j<=i; j++){
                ll.add(n);
                n=n*(i-j)/(j+1);

            }
            l.add(ll);
        }
        return l;
        
    }
}


// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

// link:https://leetcode.com/problems/pascals-triangle/description/