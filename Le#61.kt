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
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null || head.next == null || k == 0) {
            return head
        }
        
        var j = count(head)
        val rotations = k % j
        
        if (rotations == 0) {
            return head
        }

        var dummy = ListNode(0)
        dummy.next = head
        var slow: ListNode? = dummy
        var fast: ListNode? = dummy

        for (i in 0 until rotations) {
            fast = fast?.next
        }

        while (fast?.next != null) {
            fast = fast.next
            slow = slow?.next
        }

        val newHead = slow?.next
        slow?.next = null
        fast?.next = dummy.next
        return newHead
    }

    fun count(head: ListNode?): Int {
        var temp = head
        var count = 0
        while (temp != null) {
            temp = temp.next
            count++
        }
        return count
    }
}
