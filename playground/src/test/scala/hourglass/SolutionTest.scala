package hourglass

class SolutionTest extends org.scalatest.FunSuite {

  test("properlyBasicHourglass") {
    val h = Array(
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 1, 0, 0, 0, 0),
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0),
    )

    assert(7 === Solution.maxHourglass(h))
  }

  test("properlyNotSoBasicHourglass") {
    val h = Array(
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 1, 0, 0, 0, 0),
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 0, 2, 4, 4, 0),
      Array(0, 0, 0, 2, 0, 0),
      Array(0, 0, 1, 2, 4, 0),
    )

    assert(19 === Solution.maxHourglass(h))
  }

  test("properlyWithNegativeNumbers") {
    val h = Array(
      Array(-1, -1, 0, -9, -2, -2),
      Array(-2, -1, -6, -8, -2, -5),
      Array(-1, -1, -1, -2, -3, -4),
      Array(-1, -9, -2, -4, -4, -5),
      Array(-7, -3, -3, -2, -9, -9),
      Array(-1, -3, -1, -2, -4, -5),
    )

    assert(-6 === Solution.maxHourglass(h))
  }

  test("properlyHandleLastHourGlass") {
    val h = Array(
      Array(3, 7, -3, 0, 1, 8),
      Array(1, -4, -7, -8, -6, 5),
      Array(-8, 1, 3, 3, 5, 7),
      Array(-2, 4, 3, 1, 2, 7),
      Array(2, 4, -5, 1, 8, 4),
      Array(5, -7, 6, 5, 2, 8),
    )

    assert(33 === Solution.maxHourglass(h))
  }

  test("properlyHandleWhenZero") {
    val h = Array(
      Array(-1, 1, -1, 0, 0, 0),
      Array(0, -1, 0, 0, 0, 0),
      Array(-1, -1, -1, 0, 0, 0),
      Array(0, -9, 2, -4, -4, 0),
      Array(-7, 0, 0, -2, 0, 0),
      Array(0, 0, -1, -2, -4, 0),
    )

    assert(0 === Solution.maxHourglass(h))
  }

}
