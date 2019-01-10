package filters

class SolutionTest extends org.scalatest.FunSuite {

  test("properlyValueWhenDaysPassed") {
    val inputs = List(
      Solution.Contact("riya", "riya@gmail.com"),
      Solution.Contact("julia", "julia@julia.me"),
      Solution.Contact("julia", "sjulia@gmail.com"),
      Solution.Contact("julia", "julia@gmail.com"),
      Solution.Contact("samantha", "samantha@gmail.com"),
      Solution.Contact("tanya", "tanya@gmail.com"),
    )

    val expected = Array("julia", "julia", "riya", "samantha", "tanya")

    assert(expected === Solution.filterByEmail(inputs, "@gmail.com"))
  }

}
