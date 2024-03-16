
class Solution {
    fun findMaxLength(nums: IntArray): Int {
        val sum = IntArray(nums.size) { 0 }
        sum[0] = if (nums[0] == 0) -1 else 1
        val map = mutableMapOf<Int, Int>()
        var max = 0
        for (i in 0 until nums.size) {
            if (i > 0) {
                sum[i] = sum[i - 1] + if (nums[i] == 0) -1 else 1
            }
            if (sum[i] == 0) {
                max = i + 1
            } else if (map.containsKey(sum[i])) {
                max = maxOf(max, i - map[sum[i]]!!)
            } else {
                map[sum[i]] = i
            }
        }
        return max
    }
}
