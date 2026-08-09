class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix=0, count=0;

        for(int num:nums){
            prefix += num;
            int diff = prefix - k;
            if(map.containsKey(diff)) count += map.get(diff);
            map.put(prefix, map.getOrDefault(prefix, 0)+1);
        }

        return count;
    }
}
