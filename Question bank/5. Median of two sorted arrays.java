class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int steps = (nums1.length + nums2.length) / 2 + 1;
        int first = 0;
        int second = 0;
        for (int i = 0, j = 0, k = 0; i < steps; i++) {
            second = first;
            if (j < nums1.length && k < nums2.length){
                if (nums1[j] <= nums2[k]) {
                    first = nums1[j];
                    j++;
                } else {
                    first = nums2[k];
                    k++;
                }
            } else if (j >= nums1.length) {
                first = nums2[k];
                k++;
            } else {
                first = nums1[j];
                j++;
            }
        }
        if ((nums1.length + nums2.length) % 2 == 1) {
            return first;
        } else {
            return (first + second) / 2.0;
        }
    }
}
