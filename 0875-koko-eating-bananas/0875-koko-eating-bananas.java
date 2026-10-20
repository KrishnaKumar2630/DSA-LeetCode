
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = ReqTime(piles, mid);

            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public long ReqTime(int[] piles, int speed) {
        long timeTaken = 0;

        for (int i = 0; i < piles.length; i++) {
            timeTaken += ((long) piles[i] + speed - 1) / speed;
        }

        return timeTaken;
    }
}
