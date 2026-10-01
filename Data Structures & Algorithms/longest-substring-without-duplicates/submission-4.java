class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int start = 0;

        for(int end=0; end<s.length(); end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            max = (max < set.size())?set.size():max;
        }

        return max;
    }
}
