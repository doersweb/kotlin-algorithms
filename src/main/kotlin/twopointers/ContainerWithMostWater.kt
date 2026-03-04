package twopointers

/**
 * Problem: Container with most water
 * Link: https://leetcode.com/problems/container-with-most-water/description/
 * Pattern: Two pointer
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
fun maxArea(heights: IntArray?): Int {
    if (heights == null || heights.size < 2) return 0

    var pointerLeft = 0
    var pointerRight = heights.size - 1
    var maximumAreaFound = 0

    while (pointerLeft < pointerRight) {
        val leftHeight = heights[pointerLeft]
        val rightHeight = heights[pointerRight]

        val limitingHeight = if (leftHeight < rightHeight) leftHeight else rightHeight
        val currentWidth = pointerRight - pointerLeft

        val currentArea = limitingHeight * currentWidth
        if (currentArea > maximumAreaFound) {
            maximumAreaFound = currentArea
        }

        if (leftHeight < rightHeight) {
            pointerLeft++
        } else {
            pointerRight--
        }
    }

    return maximumAreaFound
}