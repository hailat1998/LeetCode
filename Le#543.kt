class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        val map = mutableMapOf<TreeNode?, MutableList<Int>>()
        count(root, map)

        var diameter = 0
        for (entry in map.values) {
            val nodeDiameter = entry[1] + entry[2]
            diameter = maxOf(diameter, nodeDiameter)
        }

        return diameter
    }

    private fun count(root: TreeNode?, map: MutableMap<TreeNode?, MutableList<Int>>) {
        if (root == null) return

        count(root.left, map)
        count(root.right, map)

        val leftDiameter = if (root.left != null) maxOf(map[root.left]?.get(1) ?: 0, map[root.left]?.get(2) ?: 0) + 1 else 0
        val rightDiameter = if (root.right != null) maxOf(map[root.right]?.get(1) ?: 0, map[root.right]?.get(2) ?: 0) + 1 else 0
        val nodeDiameter = leftDiameter + rightDiameter

        map[root] = mutableListOf(0, leftDiameter, rightDiameter)
    }
}
