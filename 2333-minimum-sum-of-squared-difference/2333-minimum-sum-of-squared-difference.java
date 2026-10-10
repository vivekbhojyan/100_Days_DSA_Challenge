import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int n = nums1.length;
        long[] diff = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
        }

        if (sum <= k) return 0;

        Arrays.sort(diff);

        long left = 0, right = diff[n - 1];

        while (left < right) {
            long mid = left + (right - left) / 2;
            long need = 0;

            for (long d : diff) {
                if (d > mid) need += d - mid;
            }

            if (need <= k) right = mid;
            else left = mid + 1;
        }

        long limit = left;
        long used = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (diff[i] > limit) {
                used += diff[i] - limit;
                diff[i] = limit;
            }
            ans += diff[i] * diff[i];
        }

        long remaining = k - used;

        for (int i = 0; i < n && remaining > 0; i++) {
            if (diff[i] > 0 && diff[i] == limit) {
                ans -= diff[i] * diff[i] - (diff[i] - 1) * (diff[i] - 1);
                remaining--;
            }
        }

        return ans;
    }
}