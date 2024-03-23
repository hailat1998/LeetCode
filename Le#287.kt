class Solution {
    fun findDuplicate(nums: IntArray): Int {
        for (num in nums) {
            val idx = Math.abs(num)
            if (nums[idx] < 0) {
                return idx
            }
            nums[idx] = -nums[idx]
        }
        return nums.size
    }
}
