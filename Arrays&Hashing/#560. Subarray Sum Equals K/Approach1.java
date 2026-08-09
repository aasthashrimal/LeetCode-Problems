class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++)
            prefix[i] = prefix[i-1] + nums[i];

        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(prefix[i] == k) count++;
            for(int j=i-1; j>=0; j--){
                if(prefix[i]-prefix[j] == k) count++;
            }
        }

        return count;
    }
}
