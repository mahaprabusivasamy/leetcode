// Date : 13/06/24
// Leetcode Link : https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

// Input: seats = [3,1,5], students = [2,7,4]
// Output: 4
// Explanation: The students are moved as follows:
// - The first student is moved from position 2 to position 1 using 1 move.
// - The second student is moved from position 7 to position 5 using 2 moves.
// - The third student is moved from position 4 to position 3 using 1 move.
// In total, 1 + 2 + 1 = 4 moves were used.
// Example 2:

// Input: seats = [4,1,5,9], students = [1,3,2,6]
// Output: 7
// Explanation: The students are moved as follows:
// - The first student is not moved.
// - The second student is moved from position 3 to position 4 using 1 move.
// - The third student is moved from position 2 to position 5 using 3 moves.
// - The fourth student is moved from position 6 to position 9 using 3 moves.
// In total, 0 + 1 + 3 + 3 = 7 moves were used.
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
       Arrays.sort(students);
       int ans=0;
       for(int i=0;i<seats.length;i++){
       ans+=Math.abs(seats[i]-students[i]);
       }
       return ans;
        }
}
