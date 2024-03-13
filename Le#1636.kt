class Solution {
    fun frequencySort(nums: IntArray) =
       nums.sortedDescending().sortedBy{ i -> nums.count { it == i }}
    
}
