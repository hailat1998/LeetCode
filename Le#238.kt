class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
         val j = nums.filter{ it != 0 }
         val containsZero = j.size != nums.size
         val countZero = nums.count{ it == 0 }
         val sum = j.fold(1) { acc, num ->
        acc * num
    }


    for(i in 0 until nums.size){
        
        if(!containsZero){
         nums[i] = sum / nums[i]
        }else{
            if(countZero == 1 && nums[i] == 0){
                nums[i] = sum
            }else{
                nums[i] = 0
            }
        }
        
    }

    return nums

    }

}
