class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int left = 0;
        int right = 0;
        int k = 0;

        int[] temp = new int[m + n];

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                temp[k] = nums1[left];
                left++;
            } else {
                temp[k] = nums2[right];
                right++;
            }
            k++;
        }

        while (left < m) {
            temp[k++] = nums1[left++];
        }

        while (right < n) {
            temp[k++] = nums2[right++];
        }

        // Copy back into nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}