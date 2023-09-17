"""
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Solution:
    loop the list in reverse order that is last element first, if the increment by one is remainder with 10 is zero then increment next digit by and come out of
    loop note while coming out set the increment to false, lastly check if still increment is present then insert 1.

"""


class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        break_it = False
        increment = False
        length = len(digits)
        for i in range(length):
            last_index = length - i - 1
            digit = digits[last_index]
            increment_by_1 = digit+1
            remainder = increment_by_1%10 
            if remainder == 0:
                digits[last_index] = 0
                increment = True
            else:
                digits[last_index] = increment_by_1
                increment = False
                break_it = True
            if break_it:
                break
        if increment:
            digits.insert(last_index, 1)

        return digits