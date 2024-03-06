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
    fun hasCycle(head: ListNode?): Boolean {
        var t1 = head 
        var t2 = head
        while(t1 != null && t1?.next != null){
            t1 = t1.next.next
            t2 = t2?.next
            if(t1 == t2){
                return true
            }
        }
        return false
    }
}
