class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var sum = 0
        for (i in operations) {
            if (i.contains("+")) sum += 1 else sum -= 1 
        }
        
        return sum
    }
}
