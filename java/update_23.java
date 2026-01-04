class Solution {
    /**
     * Shuffles an array by interleaving elements from two halves.
     * Given array [x1, x2, ..., xn, y1, y2, ..., yn],
     * returns [x1, y1, x2, y2, ..., xn, yn].
     * 
     * @param nums the input array containing 2n elements
     * @param n the number of elements in each half
     * @return the shuffled array with interleaved elements
     */
    public int[] shuffle(int[] nums, int n) {
        // Create result array with size 2n (using bit shift for multiplication by 2)
        int[] result = new int[n << 1];
      
        // Iterate through first half of the array
        for (int i = 0, resultIndex = 0; i < n; i++) {
            // Add element from first half (index i)
            result[resultIndex++] = nums[i];
          
            // Add corresponding element from second half (index i + n)
            result[resultIndex++] = nums[i + n];
        }
      
        return result;
    }
}
