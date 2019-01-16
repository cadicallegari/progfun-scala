package hackerhanckprogfun

class SolutionTest extends org.scalatest.FunSuite {

  test("sumOfOdd should work properly") {
    val input = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
    val expected = 16

    assert(expected === Solution.sumOfOdd(input))
  }

}
