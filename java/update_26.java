✅ LeetCode Q1: Set Mismatch (Easy)

Problem Summary (Exam-oriented):
Array nums should contain numbers from 1 to n.

One number is duplicated

One number is missing
Return [duplicate, missing].

🔹 Approach 1: Using Frequency Count (Easy & Safe)
Logic

Create a frequency array count[n+1]

Traverse nums and count occurrences

The number with count = 2 → duplicate

The number with count = 0 → missing

  class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        int dup = -1, miss = -1;

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) dup = i;
            if (count[i] == 0) miss = i;
        }

        return new int[]{dup, miss};
    }
}
