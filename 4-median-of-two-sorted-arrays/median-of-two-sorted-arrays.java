import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = 0;
        int[] arr = new int[n + m];
        for (int i = 0; i < n; i++) {

            arr[k++] = nums1[i];

        }
        for (int j = 0; j < m; j++) {
            arr[k++] = nums2[j];

        }
        Arrays.sort(arr);
        int i = arr.length;
        if (i%2 == 1) {
            return (double) arr[i / 2];
        } else {
            double m1 = arr[i / 2 - 1];
            double m2 = arr[i / 2];
            return (m1 + m2) / 2;
        }

    }
}