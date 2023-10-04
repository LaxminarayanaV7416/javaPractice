
// Given a string s, return the longest 
// palindromic
 
// substring
//  in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.


// NOTE::::::::::::::::
// ::: SOLUTION is in Order of N cube complexity later I will fix it to the Order N square using table of matrix NXN

//

class Solution {
    public String longestPalindrome(String s) {
        // Integer startPointer = 0;
        // Integer endPointer = s.length(); // since its not included in slicing using subString method
        // boolean startIncrement = true;
        // boolean endIncrement = false;
        // while(startPointer<endPointer){
        //     boolean res = isPalindrome(s.substring(startPointer, endPointer));
        //     if(res==true){
        //         return s.substring(startPointer, endPointer);
        //     } else {
        //         if(startIncrement==true){
        //             endIncrement = true;
        //             startIncrement = false;
        //             startPointer++;
        //         } else {
        //             startIncrement = true;
        //             endIncrement = false;
        //             endPointer--;
        //         }
        //     }
        // }

        // return s;


        // SOLVING USING NESTED LOOP
        if(isPalindrome(s)){
            return s;
        }
        String longestString = "";
        for(int i=0; i<s.length(); i++){
            for(int j=s.length(); j>i; j--){
                boolean res = isPalindrome(s.substring(i, j));
                if(res==true){
                    String temp =  s.substring(i, j);
                    if(temp.length()>longestString.length()){
                        longestString = temp;
                    }
                }
            }
        }
        return longestString;

    }

    public boolean isPalindrome(String str){
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
}