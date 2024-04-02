

class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val taskFreqMp = IntArray(26)
        for (c in tasks) {
            taskFreqMp[c - 'A']++
        }
        taskFreqMp.sort()
        var batchCnt = taskFreqMp[25]
        var vacantSlots = --batchCnt * n
        for (indx in 0 until 25) {
            vacantSlots -= Math.min(taskFreqMp[indx], batchCnt)
        }
        return if (vacantSlots > 0) tasks.size + vacantSlots else tasks.size
    }
}
