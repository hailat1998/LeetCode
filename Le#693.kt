class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
     val j = n.toString(2)
      for(i in 0 until j.length-1){
        if(j[i] == j[i+1]){
            return false
        }
       
     }
       return true
    }
}
