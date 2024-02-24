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
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        return inOrder(root, low, high)
    }
    
    fun inOrder(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0
        
        var sum = 0
        
        if (root.`val` >= low && root.`val` <= high) {
            sum += root.`val`
        }
        
        sum += inOrder(root.left, low, high)
        sum += inOrder(root.right, low, high)
        
        return sum
    }
}
