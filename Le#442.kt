class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        nums.sort()
        var prev = Int.MIN_VALUE
        val list = mutableListOf<Int>()

        for (i in 1 until nums.size) {
            if (nums[i - 1] == nums[i] && prev != nums[i]) {
                list.add(nums[i])
                prev = nums[i]
            }
        }

        return list
    }
}
