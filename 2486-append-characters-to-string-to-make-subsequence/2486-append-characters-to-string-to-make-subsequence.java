class Solution {
    public int appendCharacters(String s, String t) {
        int tIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tIndex < t.length() && s.charAt(i) == t.charAt(tIndex)) {
                ++tIndex;
            }
        }
        return t.length() - tIndex;
    }
    }