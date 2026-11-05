class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sCount: Map<Char, Int> = s.groupingBy { it }.eachCount()
        val tCount: Map<Char, Int> = t.groupingBy { it }.eachCount()
        return sCount == tCount
    }
}
