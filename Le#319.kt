class Solution {
    fun bulbSwitch(n: Int): Int {
        var sum = 0
    for(i in 1..n){
      if(Math.pow(i.toDouble(), 2.0) <= n){
        sum++
      }
      }
       return sum
    }
   
}
