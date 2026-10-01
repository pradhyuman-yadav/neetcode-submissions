class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> hashmap = new HashMap<>();

        for(; end < s.length(); end++) {

            hashmap.put(s.charAt(end), hashmap.getOrDefault(s.charAt(end), 0) + 1);

            while ((end - start + 1) - Collections.max(hashmap.values()) > k) {
                hashmap.put(s.charAt(start), hashmap.getOrDefault(s.charAt(start), 0) - 1);
                start++;
            }

            if(max < end - start + 1) {
                max = end - start + 1;
            }
        }

        return max;
    }
}
