/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
        var t= k;
       val queue : Queue<TreeNode?> = LinkedList<TreeNode?>();
        val parent : MutableMap<Int, TreeNode?> = mutableMapOf<Int, TreeNode?>();
        val ans : MutableList<Int> = mutableListOf();
        queue.offer(root);
        while(!(queue.isEmpty())){
            var size = queue.size;
            var i = 0;
            while(i < size){
                    var temp : TreeNode? =queue.poll();
                    if(temp?.left != null){
                            parent.put(temp?.left.`val`, temp);
                            queue.offer(temp?.left);
                    }
                    if(temp?.right != null){
                            parent.put(temp?.right.`val`, temp);
                            queue.offer(temp?.right);
                    }
                    i++;
            }
        }

    val visted : MutableMap<Int, Int> = mutableMapOf<Int, Int>();
    queue.offer(target);
    while(t > 0 && !queue.isEmpty()){
        var size = queue.size;
        var u=0;
        while( u < size ){
            var temp : TreeNode? = queue.poll();
            visted.put((temp?.`val`)!! , 1);
            if(temp?.left != null && !visted.containsKey(temp?.left.`val`)){
                queue.offer(temp?.left);
            }
             if(temp?.right != null && !visted.containsKey(temp?.right.`val`)){
                queue.offer(temp?.right);
            }
            if(parent.containsKey(temp?.`val`) && !visted.containsKey(parent.get(temp?.`val`)?.`val`)){
                queue.offer(parent.get(temp?.`val`))
            }
            u++;
        }
        t--;
    }
    while(!queue?.isEmpty()){
        ans.add((queue.poll()?.`val`)!!);
    }
return ans;
    } 
    }
