import java.util.*

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
       if(stones.size == 2) return Math.abs(stones[0] - stones[1])
       val reverseComparator: Comparator<Int> = Comparator.reverseOrder()
       val que = PriorityQueue<Int>(reverseComparator)
        for(i in stones){
            que.add(i)
        }
        while(que.size > 2){
            val h = que.poll()
            val j = que.poll()
            if(h != j){
                que.add(Math.abs(j - h))
            }
        }
        if(que.size == 2)
        return Math.abs(que.poll() - que.poll())
        return que.peek()
    }
}
