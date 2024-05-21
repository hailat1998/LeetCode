class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
       val list = mutableListOf<List<Int>>()

       list.add(mutableListOf<Int>())
       val size = nums.size

       for(i in 0 until size){
        for(j in 0 until list.size){
            val subList = mutableListOf<Int>()
            subList.addAll(list[j])
            subList.add(nums[i])
            list.add(subList)
        }
       }

       return list
    }
}
