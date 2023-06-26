import com.example.leetcode24.MinRotatedSortedArray
import com.example.leetcode24.Solution
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner



/**
 * Test class for the Minimum in Rotated Sorted Array problem.
 *
 * This class contains unit tests for the [Solution] implementation of finding the minimum value
 * in a rotated sorted array. It uses JUnit and MockitoJUnitRunner for testing purposes.
 */
@RunWith(MockitoJUnitRunner::class)
class MinimumTest {

    @Mock
    private lateinit var solution: MinRotatedSortedArray

    @Before
    fun setup() {
        solution = Solution()
    }

    /**
     * Test case to verify the minimum value in a sorted rotated array.
     */
    @Test
    fun `testMinimumValue_sortedRotatedArray`() {
        val nums = intArrayOf(0, 1, 2, 4, 5, 6, 7)
        assertEquals(0, solution.minRotated(nums))
    }

    /**
     * Test case to verify the minimum value in a sorted rotated array with duplicates.
     */
    @Test
    fun `testMinimumValue_sortedRotatedArrayWithDuplicates`() {
        val nums = intArrayOf(2, 2, 2, 0, 1)
        assertEquals(0, solution.minRotated(nums))
    }

    /**
     * Test case to verify the minimum value in a rotated array with one element.
     */
    @Test
    fun `testMinimumValue_rotatedArrayWithOneElement`() {
        val nums = intArrayOf(1)
        assertEquals(1, solution.minRotated(nums))
    }

    /**
     * Test case to verify the minimum value in a rotated array with two elements.
     */
    @Test
    fun `testMinimumValue_rotatedArrayWithTwoElements`() {
        val nums = intArrayOf(2, 1)
        assertEquals(1, solution.minRotated(nums))
    }

    /**
     * Test case to verify the minimum value in a rotated array with three elements.
     */
    @Test
    fun `testMinimumValue_rotatedArrayWithThreeElements`() {
        val nums = intArrayOf(3, 1, 2)
        assertEquals(1, solution.minRotated(nums))
    }

    /**
     * Test case to verify the minimum value in a rotated array with large numbers.
     */
    @Test
    fun `testMinimumValue_rotatedArrayWithLargeNumbers`() {
        val nums = intArrayOf(50, 60, 70, 80, 90, 20, 30, 40)
        assertEquals(20, solution.minRotated(nums))
    }

    /**
     * Test case to verify the minimum value in a sorted array.
     */
    @Test
    fun minimum_sorted_array_value_test1() {
        val solution = Solution()

        val nums2 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        assert(solution.minRotated(nums2) == 0)
    }
}




