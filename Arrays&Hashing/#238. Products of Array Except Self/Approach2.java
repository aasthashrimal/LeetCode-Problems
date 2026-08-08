class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        int prod = 1, zeroes = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) zeroes++;
            else prod *= nums[i];
        }

        if(zeroes > 1) return new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(zeroes == 1 && nums[i] == 0) output[i] = prod;
            else if(zeroes == 1)    output[i] = 0;
            else output[i] = prod/nums[i];
        }
        return output;
    }
}  
