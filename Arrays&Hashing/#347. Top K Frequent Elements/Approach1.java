class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq[] = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> queue =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            queue.offer(e);
        }

        for(int i=0; i<k; i++){
            freq[i] = queue.poll().getKey();
        }

        return freq;
    }
}
