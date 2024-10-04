
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int foundindex = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {

                    foundindex = j;
                    break;
                }
            }
            if (foundindex != -1) {
                boolean foundGreater = false;
                for (int j = foundindex + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        arr[i] = nums2[j];
                        foundGreater = true;
                        break;

                    }
                }
                if (!foundGreater) {
                    arr[i] = -1;
                }
            } else {
                arr[i] = -1;
            }

        }
        return arr;
    }
}