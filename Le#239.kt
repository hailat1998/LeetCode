import java.util.Deque
import java.util.ArrayDeque
import java.util.LinkedList

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val arr = IntArray(nums.size - k + 1)
        val de: Deque<Int> = LinkedList()
         var max = Int.MIN_VALUE
        for (i in 0 until nums.size - k + 1) {
            for (j in i until i + k) {
                if (max < nums[j]) {
                    max = nums[j]
                }
            }
            arr[i] = max
            max = Int.MIN_VALUE
        }
        return arr
    }
}
