class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        int idex=n-1;

        while(left <=right){
        int leftsq =nums[left]*nums[left];
        int rightsq=nums[right]*nums[right];


            if(leftsq<rightsq){
                ans[idex]=rightsq;
                right--;
                
            }else{
                ans[idex]= leftsq;
                left++;
                
            }
            idex--;
        }
        return ans;
        // for(int i =0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];

        // }
        // Arrays.sort(nums);
        // return nums;

        
    }
}