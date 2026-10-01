class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums[0] == target) return 0;

        int start = 0;
        int end = nums.length;

        while(start < end) {
            int mid = (start+end)/2;
            if(nums[mid] < target) {
                start = mid+1;
            } else if(nums[mid] > target) {
                end = mid;
            } else if(nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
