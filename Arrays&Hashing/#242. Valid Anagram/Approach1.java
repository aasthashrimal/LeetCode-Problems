class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char c[] = s.toCharArray();
        char d[] = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        s = new String(c);
        t = new String(d);
        return s.equals(t);
    }
}
