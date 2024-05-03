class Solution {
    fun compareVersion(version1: String, version2: String): Int {
        val arr1 = version1.split('.')
        val arr2 = version2.split('.')

        val length = minOf(arr1.size, arr2.size)
        val maxLength = maxOf(arr1.size, arr2.size)
        var k = 0

        for (i in 0 until length) {
            if (arr1[i].toInt() > arr2[i].toInt()) {
                return 1
            }
            if (arr1[i].toInt() < arr2[i].toInt()) {
                return -1
            }
            k = i
        }

        if (length < maxLength) {
            for (i in k + 1 until maxLength) {
                if (arr1.getOrNull(i)?.toInt() ?: 0 > 0) {
                    return 1
                }
                if (arr2.getOrNull(i)?.toInt() ?: 0 > 0) {
                    return -1
                }
            }
        }

        return 0
    }
}
