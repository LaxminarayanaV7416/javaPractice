// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


// https://leetcode.com/problems/pascals-triangle/description/

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]


import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows==1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            res.add(temp);
            return res;
        } else {
            List<List<Integer>> prev = generate(numRows-1);
            List<Integer> temp = new ArrayList<>();
            List<Integer> last = prev.get(numRows-2);
            for(int i=0; i<numRows; i++){
                if(i==0){
                    temp.add(1);
                } else if(i==numRows-1){
                    temp.add(1);
                } else {
                    Integer x = last.get(i-1);
                    Integer y = last.get(i);
                    temp.add(x+y);
                }
            }
            for(List<Integer> a:prev){
                res.add(a);
            }
            res.add(temp);
        }
        return res;
    }
}