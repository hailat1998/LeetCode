class Solution {
    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        var temp = head
        var list = mutableListOf<Int>()
        while (temp != null) {
            list.add(temp.`val`)
            temp = temp.next
        }

        while (true) {
            val k = list.size
            for (i in 0 until list.size - 2) {
                var sum = 0
                for (j in i until list.size) {
                    sum += list[j]
                    if (sum == 0) {
                        for (l in i until j + 1) {
                            list[l] = 0
                        }
                        break
                    }
                }
            }

            list = list.filter { it != 0 }.toMutableList()
            if (k == list.size) {
                break
            }
        }

       if (list.size >= 2) {
       if (list[list.size - 1] + list[list.size - 2] == 0) {
        list = list.dropLast(2).toMutableList()
              }
         }

        val dummy = ListNode(-1)
        var curr = dummy
        for (i in list) {
            curr.next = ListNode(i)
            curr = curr.next!!
        }

        return dummy.next
    }
}
