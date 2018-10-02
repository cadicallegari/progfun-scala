package factorial

class FactorialTest extends org.scalatest.FunSuite {

  test("properlyFactorial") {
    assert(6 === Solution.factorial(3))
  }

}
