class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for(i in nums){
            map[i] = map.getOrDefault(i , 0) + 1
        }
        val j = map.values.max()
        return j * map.values.count{it == j}
    }
}
