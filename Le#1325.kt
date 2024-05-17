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
    var target = 0  
    fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {
        this.target = target 
        return dfs(root)
    }


    fun dfs(root : TreeNode? ) : TreeNode? {
        if(root == null ) return null


        root?.left = dfs(root?.left)
        root?.right = dfs(root?.right)

        if(root?.left == null  &&  root?.right == null && root.`val` == target){
            return null
        }

       return root

    }
}
