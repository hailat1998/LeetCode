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
    fun pairSum(head: ListNode?): Int {
        var curr = head
        var count = 0

        while (curr != null) {
            count++
            curr = curr.next
        }

        var j = 0
        curr = head

        while (j < count / 2) {
            curr = curr?.next
            j++
        }

        var temp = reverseList(curr)
        curr = head
        var max = Int.MIN_VALUE

        while (temp != null && curr != null) {
            val sum = temp.`val` + curr.`val`
            if (sum > max) {
                max = sum
            }

            temp = temp.next
            curr = curr.next
        }

        return max
    }

    fun reverseList(head: ListNode?): ListNode? {
        var curr = head
        var prev: ListNode? = null

        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}
