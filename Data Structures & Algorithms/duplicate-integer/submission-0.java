class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> copyNums = new HashSet<>();

        for(int i: nums) {
            copyNums.add(i);
        }

        return nums.length != copyNums.size(); 
    }
}
