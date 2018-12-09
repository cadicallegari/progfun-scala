package nestedlogic

class SolutionTest extends org.scalatest.FunSuite {

  test("properlyValueWhenDaysPassed") {
    val returned = Solution.stringToDate("9 6 2015")
    val expected = Solution.stringToDate("6 6 2015")

    assert(45 === Solution.calculateFine(expected, returned))
  }

  test("properlyValueWhenMonthsPassed") {
    val returned = Solution.stringToDate("6 8 2015")
    val expected = Solution.stringToDate("6 6 2015")

    assert(1000 === Solution.calculateFine(expected, returned))
  }

  test("properlyValueWhenYearPassed") {
    val returned = Solution.stringToDate("6 6 2016")
    val expected = Solution.stringToDate("6 6 2015")

    assert(10000 === Solution.calculateFine(expected, returned))
  }

  test("properlyValueWhenYearChange") {
    val returned = Solution.stringToDate("1 1 2016")
    val expected = Solution.stringToDate("31 12 2015")

    assert(10000 === Solution.calculateFine(expected, returned))
  }

  test("properlyValueWhenMonthChange") {
    val returned = Solution.stringToDate("1 6 2015")
    val expected = Solution.stringToDate("31 5 2015")

    assert(500 === Solution.calculateFine(expected, returned))
  }

  test("properlyValueReturnedIsSmaller") {
    val returned = Solution.stringToDate("14 5 2015")
    val expected = Solution.stringToDate("15 5 2015")

    assert(0 === Solution.calculateFine(expected, returned))
  }

  test("yearCornerCase") {
    val returned = Solution.stringToDate("31 12 2009")
    val expected = Solution.stringToDate("1 1 2010")

    assert(0 === Solution.calculateFine(expected, returned))
  }

}
