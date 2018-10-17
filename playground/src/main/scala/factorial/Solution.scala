package factorial

import java.io._

object Solution {

  // Complete the factorial function below.
  def factorial(n: Int): Int = {

    def _factorial(n: Int, acc: Int): Int = {
      if (n == 0) {
        return acc
      }

      _factorial(n - 1, acc * n)
    }

    _factorial(n, 1)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val result = factorial(n)

    printWriter.println(result)

    printWriter.close()
  }
}
