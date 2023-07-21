class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        return seq(nums.toList())
    }
    
    fun seq(nums: List<Int>): Int {
        if (nums.isEmpty()) return 0
        var prev = nums[0]
        var j = -1
        var count = 1
        var i = 1
        while (i < nums.size) {
            if (prev < nums[i]) {
                prev = nums[i]
                count++
            } else {
                j = i
                break
            }
            i++
        }
        if (j == -1) return count
        return maxOf(count, seq(nums.subList(j, nums.size)))
    }
}
