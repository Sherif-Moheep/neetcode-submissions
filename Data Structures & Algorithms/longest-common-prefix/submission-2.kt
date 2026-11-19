class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        for (i in strs[0].indices) {
            for (j in 1 until strs.size) {
                if (i == strs[j].length || strs[j][i] != strs[0][i])
                    return strs[j].substring(0, i)
            }
        }
        return strs[0]
    }
}
