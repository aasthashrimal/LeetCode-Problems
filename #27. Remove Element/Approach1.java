class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==val){
                for(int j=i; j<n-1; j++){
                    nums[j]=nums[j+1];
                }
                k++;
                i--;
                n--;
            }
        }
        return nums.length - k;
    }
}
