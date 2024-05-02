class Solution {
    fun findMaxK(n: IntArray): Int {
         val map = mutableMapOf<Int , Boolean>()
         var max = -1
         val nums = n.distinct()
          for(i in 0 until nums.size){
          if(max < abs(nums[i]) && map.contains(abs(nums[i]))){
                max = abs(nums[i])
            }
          map[abs(nums[i])] = true
        }
        return max
    }
}
