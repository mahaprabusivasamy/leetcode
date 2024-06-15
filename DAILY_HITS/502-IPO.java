
// DATE : 15/06/24
// LINK : https://leetcode.com/problems/ipo/


// Example 1:

// Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
// Output: 4
// Explanation: Since your initial capital is 0, you can only start the project indexed 0.
// After finishing it you will obtain profit 1 and your capital becomes 1.
// With capital 1, you can either start the project indexed 1 or the project indexed 2.
// Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
// Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.
// Example 2:

// Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
// Output: 6


class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapital = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1]));
        PriorityQueue<int[]> maxProfit = new PriorityQueue<>((int[] a, int[] b) -> b[0] - a[0]);
        for (int i = 0; i < profits.length; i++) {
            if (w >= capital[i]) {
                maxProfit.offer(new int[] {profits[i], capital[i]});
            } else {
                minCapital.offer(new int[] {profits[i], capital[i]});
            }
        }
        int count = 0;
        while (count < k && !maxProfit.isEmpty()) {
            int[] temp = maxProfit.poll();
            w += temp[0];
            count += 1;
            while (!minCapital.isEmpty() && minCapital.peek()[1] <= w) {
                maxProfit.offer(minCapital.poll());
            }
        }
        return w;
    }
}
