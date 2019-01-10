package filters

object Solution {

  case class Contact(name: String, email: String)

  def filterByEmail(input: Seq[Contact], filter: String): Seq[String] = {
    input.filter(_.email.contains(filter)).map(_.name).sorted
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val N = stdin.readLine.trim.toInt

    val data = for (_ <- 1 to N) yield {
      val firstNameEmailID = stdin.readLine.split(" ")

      val firstName = firstNameEmailID(0)

      val emailID = firstNameEmailID(1)

      Contact(firstName, emailID)
    }

    filterByEmail(data, "@gmail.com").map(println)

  }
}
