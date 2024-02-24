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
class SolutionDD {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
       val (list1, list2) = listOf(mutableListOf<Int>(), mutableListOf<Int>())
       preOrder(root1, list1)
       preOrder(root2, list2)
       if(list1.size != list2.size) return false 
       for(i in 0 until list1.size){
           if(list1[1] != list2[i]){
               return false
           }
       }
       return true
    }


    fun preOrder(root: TreeNode?, list: MutableList<Int>){
     if(root == null )return
     preOrder(root.left, list)
     if(root.left == null && root.right == null){
         list.add(root.`val`)
         return
     }
     preOrder(root.right, list)
    }
}



class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val (list1, list2) = listOf(mutableListOf<Int>(), mutableListOf<Int>())
        preOrder(root1, list1)
        preOrder(root2, list2)
        if (list1.size != list2.size) return false
        for (i in 0 until list1.size) {
            if (list1[i] != list2[i]) {
                return false
            }
        }
        return true
    }

    fun preOrder(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) return
        preOrder(root.left, list)
        if (root.left == null && root.right == null) {
            list.add(root.`val`)
            return
        }
        preOrder(root.right, list)
    }
}
