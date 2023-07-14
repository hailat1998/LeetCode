class Solution {
    fun longestSubsequence(arr: IntArray, difference: Int): Int =
        mutableMapOf<Int, Int>().let { nrToChainLength -> //<nr, chainLength>
                (arr.lastIndex downTo 0).fold(0) { acc, index ->
                    nrToChainLength.getOrDefault(arr[index] + difference, 0)
                            .plus(1)
                            .also { nrToChainLength[arr[index]] = it }
                            .coerceAtLeast(acc)
                }
            }
}
