class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var count = bank[0].count { it == '1' }
        var sum = 0

        for (i in 1 until bank.size) {
            val h = bank[i].count { it == '1' }
            if(h != 0){ 
            sum += count * h
             count = h
            }
        }
       return sum
    }
}
