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
    fun evaluateTree(root: TreeNode?): Boolean {
        return dfs(root)
    }

    fun dfs(root: TreeNode?): Boolean {
       

        if (root?.`val` == 1) {
            return true
        }

        if (root?.`val` == 0) {
            return false
        }

        if (root?.`val` == 3) {
            return dfs(root?.left) && dfs(root?.right)
        }
     
            return dfs(root?.left) || dfs(root?.right)
        

       
    } 

}
