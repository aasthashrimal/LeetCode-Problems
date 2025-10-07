class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> res = new ArrayList<>();
    boolean[] used = new boolean[strs.length];

    for(int i=0; i<strs.length; i++){
        if (used[i]) continue;
        List<String> s = new ArrayList<>();
        s.add(strs[i]);

        for(int j=0; j<strs.length; j++){

            char c1[] = strs[i].toCharArray();
            Arrays.sort(c1);
            char c2[] = strs[j].toCharArray();
            Arrays.sort(c2);

            String s1 = new String(c1);
            String s2 = new String(c2);

            if(i!=j && s1.equals(s2) && !used[j]){
                s.add(strs[j]);
                used[j]=true;
            }
        }

        res.add(s);
        used[i] = true;
    }
    return res;
}
}
