package evenodds

class EvenOddStringsTest extends org.scalatest.FunSuite {

  test("evenodds.EvenOddStringsTest.properlyGrouped") {
    val (evens, odds) = Solution.evenOdds("Hacker")

    assert(evens === "Hce")
    assert(odds === "akr")
  }

  test("evenodds.EvenOddStringsTest.emptyString") {
    val (evens, odds) = Solution.evenOdds("")

    assert(evens === "")
    assert(odds === "")
  }

  test("evenodds.EvenOddStringsTest.singleChar") {
    val (evens, odds) = Solution.evenOdds("A")

    assert(evens === "A")
    assert(odds === "")
  }

}
