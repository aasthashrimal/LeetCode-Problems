class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==val){
                int t = nums[n-1];
                nums[n-1] = nums[i];
                nums[i]=t;
                n--;
                i--;
            }
        }
        return n;
    }
}
