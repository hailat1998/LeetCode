class Solution {
    fun removeElement(nums: IntArray, v: Int): Int {
       var k = 0
       for(i in nums){
           if(i != v){
               nums[k] = i
               k++
           }
       }
       return k
    }
}
