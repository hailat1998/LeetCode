class Solution {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
        var l = 0
        var r = 0
        var count = 0
        var sum = 0

        while (r < nums.size) {
            sum += nums[r]

            while (l < r && sum > goal) {
                sum -= nums[l]
                l++
            }

            if (sum == goal) {
                var temp = l
                count++

                while (temp < r && nums[temp] == 0) {
                    count++
                    temp++
                }
            }

            r++
        }
      return count
    }
}
