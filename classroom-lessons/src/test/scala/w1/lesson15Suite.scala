package w1.lesson15

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Lesson15Suite extends FunSuite {

  test("2") {
    assert(L15.sqrt(2) === 1.41)
  }


  test("sqrt 4 is 2") {
    assert(L15.sqrt(4) === 2)
  }

  test("0.001") {
    assert(L15.sqrt(0.001) === 0.031622777)
  }

  test("0.1e-20") {
    assert(L15.sqrt(0.1e-20) === 10)
  }

  test("1.0e20") {
    assert(L15.sqrt(1.0e20) === 10)
  }

  test("1.0e50") {
    assert(L15.sqrt(1.0e50) === 10)
  }

}
