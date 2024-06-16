
// Example 1:

// Input: nums = [1,3], n = 6
// Output: 1
// Explanation:
// Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
// Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
// Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
// So we only need 1 patch.
// Example 2:

// Input: nums = [1,5,10], n = 20
// Output: 2
// Explanation: The two patches can be [2, 4].
// Example 3:

// Input: nums = [1,2,2], n = 5
// Output: 0


class Solution {
    public int minPatches(int[] nums, int n) {
    int patches = 0;
    long x = 1;
    int length = nums.length, index = 0;
    while (x <= n) {
        if (index < length && nums[index] <= x) {
            x += nums[index];
            index++;
        } else {
            x *= 2;
            patches++;
        }
    }
    return patches;
}
}
