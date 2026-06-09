class Solution {
    public int maxSubArray(int[] nums) {
        // int currsum = 0;
        // int maxsum = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     currsum += nums[i];
        //     maxsum = Math.max(currsum, maxsum);

        //     if (currsum < 0) {
        //         currsum = 0;
        //     }
        // }
        // return maxsum;
        int currSum =0;
        int maxSum= Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);

            if(currSum < 0){
                currSum =0;
            }
        }
        return maxSum;



    }
}