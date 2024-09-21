class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int n=nums.length;
         int len = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; 
           int sum =0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==target){
        //                 return target;
        //             }
        //             else if(nums[i]+nums[j]+nums[k]==target+1){
        //                 return target+1;
        //             }
                    
        //             else{
        //                 return target-1;
        //             }
        //         }
        //     }
        // }
        // return 0;

         for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k=j+1; k<len;  k++){
                    sum = (nums[i]+nums[j]+nums[k]);
                     
                     if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}