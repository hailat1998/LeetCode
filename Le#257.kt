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
    fun binaryTreePaths(root: TreeNode?): List<String> {
     val list = mutableListOf<String>()
     val st = mutableListOf<Int>()
     dfs(root , list , st )
     return list
    }

    fun dfs(root: TreeNode? , list: MutableList<String> , st: MutableList<Int>){
        if(root == null) return
        st.add((root?.`val`)!!) 
        if(root?.left == null && root?.right == null){
        val s = st.toList().joinToString("->")
         list.add(s)
        }
         dfs(root?.left , list , st)
         dfs(root?.right , list , st)
        st.removeAt(st.size - 1)
    }
}
