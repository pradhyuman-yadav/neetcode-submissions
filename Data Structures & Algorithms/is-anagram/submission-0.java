class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<t.length(); i++) {
            char temp = t.charAt(i);
            int indexOf = s.indexOf(temp);
            if(indexOf >= 0 && indexOf != s.length()) {
                // s.replace(temp, '');
                s = s.substring(0, indexOf) + s.substring(indexOf+1, s.length());
            } else if (indexOf >= 0 && indexOf == s.length()){
                s = s.substring(0, indexOf);
                return false;
            } else {
                return false;
            }
        }

        if(s.length() > 0) return false;

        return true;
    }
}
