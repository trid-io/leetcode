// Time: O(n * klogk) - Space: O(n * k) where n is the length of strs, k is the max length of a string in strs
fun groupAnagrams_bruceForce(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return emptyList()
    val result = ArrayList<ArrayList<String>>()
    val visit = Array<Boolean>(strs.size, { false })
    for (i in strs.indices) {
        val nestedArrayList = arrayListOf<String>()
        if (visit[i]) {
            continue
        } else {
            nestedArrayList.add(strs[i])
            visit[i] = true
        }
        for (j in (i + 1)..<strs.size) {
            if (isAnagram_firstAttemp(strs[i], strs[j]) && !visit[j]) {
                nestedArrayList.add(strs[j])
                visit[j] = true
            }
        }
        result.add(nestedArrayList)
    }
    return result
}

fun isAnagram_firstAttemp(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map = mutableMapOf<Char, Int>()
    for (i in s.indices) {
        map[s[i]] = map.getOrDefault(s[i], 0) + 1
        map[t[i]] = map.getOrDefault(t[i], 0) - 1
    }
    return map.filter { (key, value) -> value != 0 }.isEmpty()
}

// Time: O(n * k) - Space: O(n * k) where n is the length of strs, k is the max length of a string in strs
fun groupAnagrams_optimized(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<List<Int>, List<String>>()
    for (word in strs) {
        val key = List(26) { 0 }.toMutableList()
        for (letter in word) {
            key[letter - 'a'] += 1
        }
        map[key] = map.getOrDefault(key, emptyList()) + word
    }
    return map.values.toList()
}


