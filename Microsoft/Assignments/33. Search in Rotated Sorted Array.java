class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
    int l = 0, r = nums.length - 1;
    while (l < r) {
        int m = l + (r - l) / 2;
        if (nums[m] >= nums[l]) {
            if (target <= nums[m] && target >= nums[l]) r = m;
            else l = m + 1;
        } else {
            if (target > nums[m] && target <= nums[r]) l = m + 1;
            else r = m;
        }
    }
    return nums[l] == target ? l : -1;
    }
}
