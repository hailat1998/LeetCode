class Solution {
    fun minOperations(boxes: String): IntArray {
    val n = boxes.length
    val answer = IntArray(n)
    
    var balls = 0
    var operations = 0
    
    
    for (i in 0 until n) {
        answer[i] += operations
        if (boxes[i] == '1') {
            balls++
        }
        operations += balls
    }
    
    balls = 0
    operations = 0
    
   
    for (i in n - 1 downTo 0) {
        answer[i] += operations
        if (boxes[i] == '1') {
            balls++
        }
        operations += balls
    }
    
    return answer
}
}
