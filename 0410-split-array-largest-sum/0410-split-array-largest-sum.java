


class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int low = MaxEl(nums, n);
        int high = Sum(nums, n);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (SubarrayCount(nums, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public int MaxEl(int[] nums, int n) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public int Sum(int[] nums, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public int SubarrayCount(int[] nums, int maxSum) {
        int count = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= maxSum) {
                sum += nums[i];
            } else {
                count++;
                sum = nums[i];
            }
        }

        return count;
    }
}
