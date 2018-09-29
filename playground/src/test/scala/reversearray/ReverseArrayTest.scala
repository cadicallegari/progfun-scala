package reversearray

class ReverseArrayTest extends org.scalatest.FunSuite {

  test("reversearray.ReverseArrayTest.properlyReverseArray") {
    val arr = Array(1, 4, 3, 2)

    assert(arr.reverse === Solution.reverseSeq(arr))
  }

  test("reversearray.ReverseArrayTest.EmptyArray") {
    val arr: Array[Int] = Array()

    assert(arr.reverse === Solution.reverseSeq(arr))
  }

}
