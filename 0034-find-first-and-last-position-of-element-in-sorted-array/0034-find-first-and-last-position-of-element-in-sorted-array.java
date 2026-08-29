class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // Find first position
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;     // possible first position
                high = mid - 1;   // IMPORTANT: go LEFT
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Find last position
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;     // possible last position
                low = mid + 1;    // IMPORTANT: go RIGHT
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}