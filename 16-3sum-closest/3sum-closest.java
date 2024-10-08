class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int n=nums.length;
        int sum=nums[0]+nums[1]+nums[n-1];
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int curr_sum=nums[i]+nums[j]+nums[k];
                if(curr_sum<=target){
                    j++;
                }
                else{
                    k--;
                }
                if(Math.abs(sum-target)>Math.abs(curr_sum-target)){
                    sum=curr_sum;
                }
            }
        }
        return sum;
    }
}