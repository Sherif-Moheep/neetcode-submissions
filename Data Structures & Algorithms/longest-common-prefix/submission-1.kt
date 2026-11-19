class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        for (i in strs[0].indices) {
            for (str in strs) {
                if (i == str.length || str[i] != strs[0][i]) return str.substring(0, i)
            }
        }
        return strs[0]
    }
}
