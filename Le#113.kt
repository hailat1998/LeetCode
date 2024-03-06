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
    fun pathSum(root: TreeNode?, t: Int): List<List<Int>> {
        val list = mutableListOf<MutableList<Int>>()
        val l = mutableListOf<Int>()
        sums(root, list, l, t)
        return list
    }

    private fun sums(root: TreeNode?, list: MutableList<MutableList<Int>>, sin: MutableList<Int>, t: Int) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            sin.add(root.`val`)
            if (sin.sum() == t) {
                list.add(sin.toMutableList())
            }
            sin.removeAt(sin.lastIndex)
            return
        }
        sin.add(root.`val`)
        sums(root.left, list, sin, t)
        sums(root.right, list, sin, t)
        sin.removeAt(sin.lastIndex)
    }
}
