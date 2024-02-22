class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val set1 = mutableListOf<Int>()
        val set2 = mutableListOf<Int>()

        for(i in nums){
            if(i > 0){
               set1.add(i) 
            }else{
                set2.add(i)
            }
        }
       val arr = IntArray(nums.size)
       var j = true
       var k = 0 
       var u = 0
        for(i in 0..nums.size-1){
             if(j){
                 arr[i] = set1[k]
                 k++
                 j = false
             } else{
                 arr[i] = set2[u]
                 u++
                 j = true
             }
        }
        return arr
    }
}
