package prime

class SolutionTest extends org.scalatest.FunSuite {

  test("properlyCheckPrimality") {
    assertResult(false) {
      Solution.isPrime(12)
    }
    assert(Solution.isPrime(7))
    assert(Solution.isPrime(5))
  }

}
