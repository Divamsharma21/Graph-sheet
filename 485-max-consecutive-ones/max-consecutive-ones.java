class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int count=0;
        // int n=nums.length;
        // int cout=0;

        // if(nums[0]==1){
        // count++;
        // cout++;
        // }

        // for(int i=1;i<n;i++){
        // if(nums[i]==1){
        // count++;
        // cout=Math.max(cout,count);

        // }else{
        // count=0;
        // }

        // }
        // return cout;
        // }

        int count = 0;
        int max = 0;
        for (long a : nums) {
            if (a == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}