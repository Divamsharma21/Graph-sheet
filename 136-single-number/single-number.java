class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1; i=i+2){
        //     if(nums[i] != nums[i+1])
        //         return nums[i];
        // }
        // return nums[nums.length-1];

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1) return nums[i];
        }
        return 0;
    }
}