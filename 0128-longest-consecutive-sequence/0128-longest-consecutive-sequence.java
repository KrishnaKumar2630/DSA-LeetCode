import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int lastsmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] - 1 == lastsmaller) {
                count += 1;
                lastsmaller = nums[i];
            }

            else if (nums[i] == lastsmaller) {
                // Duplicate: ignore it
                continue;
            }

            else {
                lastsmaller = nums[i];
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}