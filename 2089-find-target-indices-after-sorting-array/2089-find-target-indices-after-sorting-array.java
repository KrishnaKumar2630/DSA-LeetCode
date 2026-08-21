import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        // Bubble Sort
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    didSwap = 1;
                }
            }

            if (didSwap == 0)
                break;
        }

        // Store indices
        for (int k = 0; k < n; k++) {
            if (nums[k] == target) {
                list.add(k);
            }
        }

        return list;
    }
}