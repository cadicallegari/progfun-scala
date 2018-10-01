package phonebook

class PhoneBookTest extends org.scalatest.FunSuite {

  test("reversearray.ReverseArrayTest.ReturnNotFoundWhenEmpty") {
    val book = new Solution.PhoneBook()

    assert(None === book.get("any"))
  }

  test("reversearray.ReverseArrayTest.properlyLookup") {
    val book = new Solution.PhoneBook()

    val number = "666"
    book.set("some", number)
    book.set("any", "bla")

    assert(Some(number) === book.get("some"))
  }

}
