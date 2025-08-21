class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix ="", temp;
        for(int i=1; i<=strs[0].length(); ){
            temp = strs[0].substring(0, i);
            for(String str: strs){
                if(!str.startsWith(temp))
                    return prefix;
            }
            prefix = temp;
            i++;
        }
        return prefix;
    }
}
