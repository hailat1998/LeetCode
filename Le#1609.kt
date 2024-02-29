import java.util.*

class Solution {
    fun isEvenOddTree(root: TreeNode?): Boolean {
        return levelOrder(root)
    }

    private fun levelOrder(root: TreeNode?): Boolean {
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)

        var level = 0
        while (!queue.isEmpty()) {
            val size = queue.size
            var prevVal = if (level % 2 == 0) Int.MIN_VALUE else Int.MAX_VALUE

            for (i in 0 until size) {
                val node = queue.poll()
                val value = node.`val`

                if (level % 2 == 0) {
                    if (value % 2 == 0 || value <= prevVal) {
                        return false
                    }
                } else {
                    if (value % 2 == 1 || value >= prevVal) {
                        return false
                    }
                }

                prevVal = value

                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }

            level++
        }

        return true
    }
}
