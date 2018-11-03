package palindrome

class SolutionTest extends org.scalatest.FunSuite {

  test("emptyQueueThrowException") {
    val s = new Solution()
    intercept[NoSuchElementException] {
      s.dequeueCharacter()
    }
  }

  test("dequeueProperly") {
    val s = new Solution()
    s.enqueueCharacter('a')
    s.enqueueCharacter('b')

    assert('a' === s.dequeueCharacter())
  }

  test("emptyStachThrowException") {
    val s = new Solution()
    intercept[NoSuchElementException] {
      s.popCharacter()
    }
  }

  test("pushProperly") {
    val s = new Solution()
    s.pushCharacter('a')
    s.pushCharacter('b')

    assert('b' === s.popCharacter())
  }

}
