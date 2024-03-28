class Solution {
    fun maxSubarrayLength(nums: IntArray, k: Int): Int {
        var ans = 0
        val mp = hashMapOf<Int, Int>()
        var l = 0

        for (r in 0 until nums.size) {
            mp[nums[r]] = mp.getOrDefault(nums[r], 0) + 1
            while (mp[nums[r]]!! > k) {
                mp[nums[l]] = mp[nums[l]]!! - 1
                l++
            }
            ans = maxOf(ans, r - l + 1)
        }

        return ans
    }
}
