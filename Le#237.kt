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
    fun deleteNode(node: ListNode?) {
        node?.let {
            if (it.next != null) {
                val nextNode = it.next
                it.`val` = nextNode?.`val` ?: 0
                it.next = nextNode?.next
            }
        }
    }
}
