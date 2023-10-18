Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

code :
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int nlen=len1+len2;
        int newArray[]=new int[nlen];
        System.arraycopy(nums1,0,newArray,0,len1);
        System.arraycopy(nums2,0,newArray,len1,len2);
        Arrays.sort(newArray);
        if(nlen%2==1)
        {
            return newArray[nlen/2];
        }
        else{
            int midd1=newArray[(nlen-1)/2];
            int midd2=newArray[nlen/2];
            return (double) ((midd1+midd2)/2.0);
        }
    }
}
