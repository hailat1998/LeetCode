/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */


class Solution {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var t1 = list1
        var t2 = list2
        var count = 0
        var c = 0
        while(count < a-1){
            t1 = t1?.next
            count++
        }
          t2 = t1?.next
        while(c < b-a+1){
            t2 = t2?.next
            c++ 
        }
        var t3 = list2
        while(t3?.next != null){
            t3 = t3?.next
        }
        t1?.next = list2
        t3?.next = t2
        return list1
    }
}
