class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        val set = nums1.toMutableSet()
        val set2 = nums2.toSet().toList()

        for (i in 0 until set2.size) {
            if (!set.add(set2[i])) {
                return set2[i]
            }
        }
        return -1
    }
}
