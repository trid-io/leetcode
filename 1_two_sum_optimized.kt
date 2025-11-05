// Time: O(n) - Space: O(n)
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, value ->
        val complement = target - value
        if (map.contains(complement)) {
            return intArrayOf(map.getValue(complement), index)
        }
        map[value] = index
    }
    return intArrayOf()
}