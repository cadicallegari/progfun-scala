package phonebook

object Solution {

  class PhoneBook() {
    var contacts: scala.collection.mutable.Map[String, String] = collection.mutable.Map()

    def set(name: String, number: String) = contacts(name) = number

    def get(name: String) = contacts.get(name)

  }


  def run() {
    val stdin = scala.io.StdIn

    val book = new PhoneBook()

    val n = stdin.readLine.trim.toInt

    def _readContacts(i: Int): Any = {
      if (i >= n) {
        return
      }

      val contact = stdin.readLine.split(" ").map(_.trim)
      book.set(contact(0), contact(1))

      return _readContacts(i + 1)
    }


    def _lookupContacts(): Any = {
      val name = stdin.readLine.trim

      if (name.isEmpty) {
        return
      }

      val number = book.get(name)
      number match {
        case Some(number) => println(s"$name=$number")
        case None => println("Not found")
      }

      return _lookupContacts()
    }

    _readContacts(0)

    _lookupContacts()

  }


  def main(args: Array[String]) {
    run()
  }

}