class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        int closestSum = nums[0] + nums[1] + nums[2];
        int sum = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = (nums[i] + nums[j] + nums[k]);
                    if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;

        // for(int i=0; i<len-2; i++){
        // for(int j=i+1; j<len-1; j++){
        // for(int k=j+1; k<len; k++){
        // sum = (nums[i]+nums[j]+nums[k]);

        // if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
        // closestSum = sum;
        // }
        // }
        // }
        // }
        // return closestSum;
    }
}