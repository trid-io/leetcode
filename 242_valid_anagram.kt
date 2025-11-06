// Time: O(n) - Space: O(1) (maximum 26 letters)
fun isAnagram_firstAttempt(s: String, t: String): Boolean {
    val mapS = mutableMapOf<Char, Int>()
    val mapT = mutableMapOf<Char, Int>()
    for (letter in s) {
        val current = mapS.getOrDefault(letter, 0)
        mapS.put(letter, current + 1)
    }
    for (letter in t) {
        val current = mapT.getOrDefault(letter, 0)
        mapT.put(letter, current + 1)
    }
    return mapS == mapT
}

// Time: O(n) - Space: O(1) (maximum 26 letters)
fun isAnagram_secondAttempt(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map = mutableMapOf<Char, Int>()
    for (letter in s) {
        val current = map.getOrDefault(letter, 0)
        map.put(letter, current + 1)
    }
    for (letter in t) {
        val current = map.getOrDefault(letter, 0)
        map.put(letter, current - 1)
    }
    for (key in map.keys) {
        if (map[key] != 0) {
            return false
        }
    }
    return true
}

// Time: O(n) - Space: O(1) (maximum 26 letters)
fun isAnagram_thirdAttempt(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    val map = mutableMapOf<Char, Int>() 
    for (i in s.indices) {
        map[s[i]] = map.getOrDefault(s[i], 0) + 1
        map[t[i]] = map.getOrDefault(t[i], 0) - 1
    }
    return map.filter { (key, value) -> value != 0 }.size == 0
}