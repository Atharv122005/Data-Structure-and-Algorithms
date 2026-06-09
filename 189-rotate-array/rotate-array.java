class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        helper(nums,0,nums.length -1);
        helper(nums,0,k-1);
        helper(nums, k ,nums.length -1);
    }
    public static void helper( int nums[], int first,int last){
        while(first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first ++;      
            last --;  
            
        }

    }
}