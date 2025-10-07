class Solution {

    static class StringWithSortedForm {
        String original; 
        String sorted;   
        StringWithSortedForm(String original) {
            this.original = original;
            char[] chars = original.toCharArray();
            Arrays.sort(chars); 
            this.sorted = new String(chars);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        List<StringWithSortedForm> list = new ArrayList<>();
        for (String s : strs) {
            list.add(new StringWithSortedForm(s));
        }
        Collections.sort(list, (a, b) -> a.sorted.compareTo(b.sorted));

        List<List<String>> result = new ArrayList<>();
        if (list.isEmpty()) {
            return result;
        }

        List<String> currentGroup = new ArrayList<>();
        currentGroup.add(list.get(0).original);

        for (int i = 1; i < list.size(); i++) {
           
            if (list.get(i).sorted.equals(list.get(i - 1).sorted)) {
                currentGroup.add(list.get(i).original);
            } else {
                result.add(currentGroup);
                currentGroup = new ArrayList<>();
                currentGroup.add(list.get(i).original);
            }
        }
        result.add(currentGroup);
        return result;
    }
}
