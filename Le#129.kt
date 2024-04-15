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
    var sum = 0
    
    fun sumNumbers(root: TreeNode?): Int {
        sumR(root, 0)
        return sum
    }
    
    fun sumR(root: TreeNode?, curr: Int) {
        if (root == null) {
            return
        }
        
        val newCurr = curr * 10 + root.`val`
        
        if (root.left == null && root.right == null) {
            sum += newCurr
            return
        }
        
        sumR(root.left, newCurr)
        sumR(root.right, newCurr)
    }
}
