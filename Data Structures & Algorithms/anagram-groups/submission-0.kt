class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<List<Int>, MutableList<String>>()
        val result = mutableListOf<MutableList<String>>()

        for (str in strs) {
            val arr = IntArray(26)
            for (char in str) {
                arr[char - 'a']++
            }

            map.getOrPut(arr.toList()) { mutableListOf() }.add(str)
        }

        for (list in map.values) {
            result.add(list)
        }

        return result
    }
}
