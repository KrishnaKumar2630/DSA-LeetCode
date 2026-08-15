class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int dig = DigitCount(nums[i]);
            if (dig % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    int DigitCount(int num) {
        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            return 1;
        }

        return (int) (Math.log10(num) + 1);
    }
}