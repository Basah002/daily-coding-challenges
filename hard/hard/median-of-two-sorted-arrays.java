class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];
        double median = 0;
        int length = merged.length;

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int pos = length / 2;
        if (length % 2 == 1) {

            median = merged[pos];
            return median;

        } else {

            median = (double) (merged[pos] + merged[pos - 1]) / 2;

        }

        return median;
    }
}
