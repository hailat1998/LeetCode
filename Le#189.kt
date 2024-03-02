class Solution {
    fun rotate(nums: IntArray, k: Int) {
          val s = nums.size
            val k = k % s
          val l = IntArray(s)

        for (i in 0 until k) {
            l[i] = nums[s - k + i]
            }

        for (i in k until s) {
            l[i] = nums[i - k]
           }

        for (i in 0 until s) {
              nums[i] = l[i]
          }
    }
}
