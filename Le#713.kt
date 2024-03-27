class Solution {
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        var count = 0

        for (i in 0 until nums.size) {
            var p = nums[i]
            if (p < k) {
                count++
            } else {
                continue
            }
            var j = i + 1
            while (j < nums.size) {
                p *= nums[j]
                if (p < k) {
                    count++
                } else {
                    break
                }
                j++
            }
        }
        return count
    }
}
