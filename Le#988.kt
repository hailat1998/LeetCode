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
    fun smallestFromLeaf(root: TreeNode?): String {
        val result = StringBuilder("z".repeat(8500))
        dfs(root, StringBuilder(), result)
        return result.toString()
    }

    fun dfs(root: TreeNode?, sb: StringBuilder, result: StringBuilder) {
        if (root == null) return
        sb.append(('a' + root.`val`).toChar())
        if (root.left == null && root.right == null) {
            val reversedString = sb.reversed().toString()
            if (reversedString < result.toString()) {
                result.setLength(0)
                result.append(reversedString)
            }
        }
        dfs(root.left, sb, result)
        dfs(root.right, sb, result)
        sb.deleteCharAt(sb.length - 1)
    }
}
