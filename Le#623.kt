import java.util.*; 

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
        if (depth == 1) {
            val newRoot = TreeNode(`val`)
            newRoot.left = root
            return newRoot
        }

        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        queue.offer(root)

        var currentDepth = 1
        while (currentDepth < depth - 1) {
            val size = queue.size
            for (i in 0 until size) {
                val temp = queue.poll()

                temp?.left?.let {
                    queue.offer(it)
                }
                temp?.right?.let {
                    queue.offer(it)
                }
            }
            currentDepth++
        }

        while (!queue.isEmpty()) {
            val temp = queue.poll()
            val left = temp?.left
            val right = temp?.right
            temp?.left = TreeNode(`val`)
            temp?.left?.left = left
            temp?.right = TreeNode(`val`)
            temp?.right?.right = right
        }

        return root
    }
}
