package listreplication

import org.scalatest.prop.TableDrivenPropertyChecks._

class SolutionTest extends org.scalatest.FunSuite {

  test("shouldProcessProperly") {
    val times = 3
    val input = List(1, 2, 3, 4)
    val expected = List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4)

    assert(expected === Solution.f(times, input))
  }

}
