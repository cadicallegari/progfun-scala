package prime

object Solution {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) {
      return false
    }
    if (n <= 3) {
      return true
    }

    if (n % 2 == 0 || n % 3 == 0) {
      return false
    }

    def lp(i: Int): Boolean = {
      if ((i * i) > n) {
        return true
      }

      if (n % i == 0 || n % (i + 2) == 0) {
        return false
      }

      return lp(i + 6)
    }

    lp(5)
  }

  def humanizePrime(i: Int): String = {
    if (isPrime(i)) {
      "Prime"
    } else {
      "Not prime"
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val q = stdin.readInt()

    for (_ <- 0 until q) {
      val n = stdin.readInt()
      println(humanizePrime(n))
    }

  }
}
