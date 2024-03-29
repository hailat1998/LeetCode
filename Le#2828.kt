class Solution {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        val max = nums.maxOrNull() ?: 0
        var count = 0
        var ans = 0L
        var l = 0
        var r = 0

        while (r < nums.size) {
            if (nums[r] == max) {
                count++
            }
            while (count >= k) {
                if (nums[l] == max) {
                    count--
                }
                l++
                ans += nums.size - r
            }
            r++
        }
        return ans
    }
}
