class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            int t = map.getOrDefault(diff, -1);
            if(t!=-1 && t!=i) return new int[]{i, t};
        }

        return new int[]{-1, -1};
    }
}
