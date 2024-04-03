class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var r = nums.size - 1
        var l = 0
        while (l <= r) {
            val mid = l + (r - l) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> l = mid + 1
                else -> r = mid - 1
            }
        }
        return -1
    }
}
