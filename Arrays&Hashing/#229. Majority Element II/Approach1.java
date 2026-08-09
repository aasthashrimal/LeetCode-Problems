class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Integer num: map.keySet()){
            if(map.get(num)>nums.length/3) list.add(num);
        }

        return list;
    }
}
