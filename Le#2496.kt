class Solution {
    fun maximumValue(strs: Array<String>): Int {
        var max = 0 // Initialize max variable
        val set = setOf('1', '2', '3', '4', '5', '6', '7', '8', '9', '0')

        for (i in strs) {
            var k = true // Initialize k variable inside the loop

            i.forEach {
                if (!set.contains(it)) {
                    k = false
                }
            }

            if (k) {
                val num = i.toInt()
                if (max < num) {
                    max = num
                }
            } else {
                if (max < i.length) {
                    max = i.length
                }
            }
        }

        return max
    }
}
