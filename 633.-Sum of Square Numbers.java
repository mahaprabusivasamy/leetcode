
// DATE : 17/06/2024
// LINK : https://leetcode.com/problems/sum-of-square-numbers/description/

// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5
// Example 2:

// Input: c = 3
// Output: false


class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0){
            return false;
        }
        int left=0;
        int right= (int) Math.sqrt(c);
        while(left<=right){
            long sum=(long)left*left+(long)right*right;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
