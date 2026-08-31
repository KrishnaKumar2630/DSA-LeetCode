class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mergarr[] = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                mergarr[k] = nums1[i];
                i++;
            }
            else {
                mergarr[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length) {
            mergarr[k] = nums1[i++];
            k++;
        }

        while (j < nums2.length) {
            mergarr[k] = nums2[j++];
            k++;
        }

        int n = mergarr.length;

        if (n % 2 == 1) {
            return mergarr[n / 2];
        }
        else {
            return (mergarr[n / 2 - 1] + mergarr[n / 2]) / 2.0;
        }
    }
}