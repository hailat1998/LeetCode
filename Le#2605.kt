class Solution {
    fun minNumber(nums1: IntArray, nums2: IntArray): Int {
        val j = nums1.min()
        val k = nums2.min()
        val inter = nums2.intersect(nums1.toList())
        return if (inter.isNotEmpty()) {
            inter.min()
        } else {
                 if (j > k)
                    k * 10 + j
                else
                    j * 10 + k
             
        }
    }
}
