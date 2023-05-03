package problema_03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Q3Test {

  @Test
  fun testGenerateNextNumberA_WithEmptyList() {
    val numbers = mutableListOf<Int>()
    val expected = Pair(0, mutableListOf<Int>())
    val actual = generateNextNumberA(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberA_WithListContainingNumbers() {
    val numbers = mutableListOf(1, 3, 5, 7)
    val expected = Pair(9, mutableListOf(1, 3, 5, 7, 9))
    val actual = generateNextNumberA(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberB_WithEmptyList() {
    val numbers = mutableListOf<Int>()
    val expected = Pair(0, mutableListOf<Int>())
    val actual = generateNextNumberB(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberB_WithListContainingNumbers() {
    val numbers = mutableListOf(1, 2, 4, 8, 16, 32, 64)
    val expected = Pair(128, mutableListOf(1, 2, 4, 8, 16, 32, 64, 128))
    val actual = generateNextNumberB(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberC_WithEmptyList() {
    val numbers = mutableListOf<Int>()
    val expected = Pair(0, mutableListOf<Int>())
    val actual = generateNextNumberC(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberC_WithListContainingNumbers() {
    val numbers = mutableListOf(0, 1, 4, 9, 16, 25, 36)
    val expected = Pair(49, mutableListOf(0, 1, 4, 9, 16, 25, 36, 49))
    val actual = generateNextNumberC(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberD_WithEmptyList() {
    val numbers = mutableListOf<Int>()
    val expected = Pair(0, mutableListOf<Int>())
    val actual = generateNextNumberD(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberD_WithListContainingNumbers() {
    val numbers = mutableListOf(4, 16, 36, 64)
    val expected = Pair(100, mutableListOf(4, 16, 36, 64, 100))
    val actual = generateNextNumberD(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberE_WithEmptyList() {
    val numbers = mutableListOf<Int>()
    val expected = Pair(0, mutableListOf<Int>())
    val actual = generateNextNumberE(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberE_WithListContainingNumbers() {
    val numbers = mutableListOf(1, 1, 2, 3, 5, 8)
    val expected = Pair(13, mutableListOf(1, 1, 2, 3, 5, 8, 13))
    val actual = generateNextNumberE(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberF_WithEmptyList() {
    val numbers = mutableListOf<Int>()
    val expected = Pair(0, mutableListOf<Int>())
    val actual = generateNextNumberF(numbers)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun testGenerateNextNumberF_WithListContainingNumbers() {
    val numbers = mutableListOf(2, 10, 12, 16, 17, 18, 19)
    val expected = Pair(200, mutableListOf(2, 10, 12, 16, 17, 18, 19, 200))
    val actual = generateNextNumberF(numbers)
    Assertions.assertEquals(expected, actual)
  }
}