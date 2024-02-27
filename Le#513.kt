import java.util.Queue
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
    fun findBottomLeftValue(root: TreeNode?): Int {
        val q : Queue<TreeNode> = LinkedList<TreeNode>()

         q.offer(root)
          var r = root
         while(!q.isEmpty()){
             val size = q.size
              r =  q.peek()
             for(i in 1..size){
                 val temp = q.poll()
                if(temp?.left != null){
                    q.offer(temp.left)
                }
                 if(temp?.right != null){
                    q.offer(temp.right)
                }
             }
         }

         return r?.`val`!!
    }
}
