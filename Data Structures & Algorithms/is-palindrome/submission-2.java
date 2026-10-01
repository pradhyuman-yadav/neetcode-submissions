class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[\\?\\.\\%\\:\\,\\'\\ ]", "");
        int i=0;
        int size = s.length();
        while(i<size/2) {
            if(s.charAt(i) != s.charAt(size - i - 1)) {
                return false;
            }
            i++;
        }
        System.out.println(s);
        return true;
    }
}
