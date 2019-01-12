package bitwise

object Solution {

  def doProcess(n: Int, k: Int): Int = {

    def loop(a: Int, b: Int, max: Int): Int = {
      if (a >= n - 1) {
        return max
      }

      if (b > n) {
        return loop(a + 1, a + 2, max)
      }

      val res = a & b

      if (res > max && res < k) {
        return loop(a, b + 1, res)
      }

      loop(a, b + 1, max)
    }

    loop(1, 2, 0)
  }

  def main(args: Array[String]) {
    case class Entry(N: Int, K: Int)

    val stdin = scala.io.StdIn

    val N = stdin.readLine.trim.toInt

    val data = for (_ <- 1 to N) yield {
      val splited = stdin.readLine.split(" ")

      Entry(splited(0).toInt, splited(1).toInt)
    }

    data.map(x => doProcess(x.N, x.K)).map(println)

  }
}
