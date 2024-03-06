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
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head 
        var fast = head 
        var count = 0
        while(fast != null && fast.next != null){
            count++
            slow = slow?.next
            fast = fast?.next?.next 
        }
         return slow
    }
}
