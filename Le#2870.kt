class Solution {
    fun minOperations(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
        }
        var count = 0
        for (i in map.values) {
            if(i == 1) return -1
          count += i / 3 
          if(i % 3 != 0) count++
        }
        return count
    }
}
