class Solution {
    fun isValidSerialization(preorder: String): Boolean {
        val arr  = preorder.split(',')
        var diff = 1 
        for(i in arr){
            if(diff-- < 0) return false 
            if(i != "#") diff += 2
        }
        return diff == 0
    }
}
