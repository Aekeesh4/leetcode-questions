class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;

        int left = 1;
        int right = getMax(bloomDay);

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return canMake(bloomDay, m, k, left) ? left : -1;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

    private int getMax(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            max = Math.max(max, day);
        }
        return max;
    }
}