class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
// this method 1 using sorting
        // Arrays.sort(nums);

        // if (nums[0] != 0)
        //     return 0;
        // if (nums[n - 1] != n)
        //     return n;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != i) {
        //         return i;
        //     }
        // }
        // return 0;
        int[] v=new int[n+1];
        Arrays.fill(v,-1);

        for(int i=0;i<n;i++){
            v[nums[i]]=nums[i];
        }
        for(int i=0;i<v.length;i++){
            if(v[i]==-1) return i;
        }
        return 0;
    }
}