package bubblesort

class SolutionTest extends org.scalatest.FunSuite {

//  test("emptyArray") {
//    val a: Array[Int] = Array()
//
//    val (swaps, first, last) = Solution.sort(a)
//
//    assert(0 === swaps)
//    assert(0 === first)
//    assert(0 === last)
//  }


  test("properlySortArray") {
    val a = Array(3, 2, 1)

    val (swaps, first, last) = Solution.sort(a)

    assert(3 === swaps)
    assert(1 === first)
    assert(3 === last)
  }

}
