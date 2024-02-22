class Solution {
    fun missingNumber(nums: IntArray): Int {
       nums.sort()
       for(i in 0 until nums.size-1){
           if(nums[i+1] - nums[i] != 1){
               return i+1
           }
       }
       if(nums.size != nums.last()) return nums.last()+1 
       if(nums[0] != 0) return 0
       if(nums.size == 1 && nums[0] != 0 ) return 0
       return -1
    }
}
