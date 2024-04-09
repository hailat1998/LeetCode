class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var sum = 0
        for(i in 0 until tickets.size){
            if(i <= k){
                sum += Math.min(tickets[i] , tickets[k])
            }else{
                sum += Math.min(tickets[i] , tickets[k] - 1)
            }
        }
     return sum
    }
}
