package binarynumbers

class BinaryNumbersTest extends org.scalatest.FunSuite {

  test("binarynumbers.countContinuous1Properly") {

    assert(1 === Solution.continuousOnes(5))
    assert(2 === Solution.continuousOnes(13))
    assert(3 === Solution.continuousOnes(439))
  }

}
