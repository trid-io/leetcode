 // Time: O(n^2) - Space: O(1)
 fun twoSum_bruceForce(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in (i + 1)..<nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
             }
         }
    }
    return intArrayOf()
}

// Time: O(n) - Space: O(n)
fun twoSum_optimized(nums: IntArray, target: Int): IntArray {
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