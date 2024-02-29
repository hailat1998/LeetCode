class Solution {
    fun maxProduct(root: TreeNode?): Int {
        val sum = levelOrder(root)
        val map = mutableMapOf<TreeNode, Long>()
        var max = Long.MIN_VALUE

        sumUp(root, map)

        for ((key, value) in map) {
            val p: Long = ((sum - value) * value)
            if (max < p) {
                max = p
            }
        }

        return (max % 1000000007).toInt()
    }

    private fun sumUp(root: TreeNode?, map: MutableMap<TreeNode, Long>) {
        if (root == null) return

        sumUp(root.left, map)
        sumUp(root.right, map)

        val leftSum = map[root.left] ?: 0L
        val rightSum = map[root.right] ?: 0L
        map[root] = root.`val` + leftSum + rightSum
    }

    private fun levelOrder(root: TreeNode?): Long {
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)
        
        var sum = 0L
        while (!queue.isEmpty()) {
            val node = queue.poll()
            sum += node.`val`

            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }

        return sum
    }
}
