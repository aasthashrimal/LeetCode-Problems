class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
