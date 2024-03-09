/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
       var t1 = l1 
       var t2 = l2
       var t3 : ListNode? = ListNode(-1)
       var t4 = t3
       var rem = 0
       while(t1 != null || t2 != null || rem != 0){
        val sum = ((t1?.`val` ?: 0) + (if (t2 != null) t2.`val` else 0) + rem)
         rem = sum / 10
         t3?.next = ListNode(sum % 10)
         t1 = t1?.next
         t2 = t2?.next
         t3 = t3?.next 
       }
       return t4?.next
    }

}
