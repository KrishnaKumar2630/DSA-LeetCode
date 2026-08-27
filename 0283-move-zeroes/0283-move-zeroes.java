class Solution {
    public void moveZeroes(int[] arr) {
        int j = -1;

        // Find the first zero
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero exists, nothing to do
        if(j == -1)
            return;

        // Move non-zero elements forward
        for(int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
}