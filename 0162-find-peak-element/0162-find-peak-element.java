class Solution {
    public int findPeakElement(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        // Check first element
        if (nums[0] > nums[1]) {
            return 0;
        }

        // Last element is a peak
        return nums.length - 1;
    }
}