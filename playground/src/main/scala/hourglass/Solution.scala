package hourglass

object Solution {

  def maxHourglass(arr: Array[Array[Int]]): Int = {
    var max: Int = -9999

    def _maxHourGlass(i: Int, j: Int): Int = {
      if (i >= (arr.length - 1) && j > (arr.length - 2)) {
        return max
      }

      var sum = arr(i)(j)

      // TODO improve it maybe using yield
      sum += arr(i - 1)(j - 1)
      sum += arr(i - 1)(j)
      sum += arr(i - 1)(j + 1)

      sum += arr(i + 1)(j - 1)
      sum += arr(i + 1)(j)
      sum += arr(i + 1)(j + 1)

      if (sum > max) {
        max = sum
      }

      if (i >= (arr.length - 2) && j >= (arr.length - 2)) {
        return max
      }

      if (j >= (arr.length - 2)) {
        return _maxHourGlass(i + 1, 1)
      }

      _maxHourGlass(i, j + 1)
    }

    _maxHourGlass(1, 1)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    println(maxHourglass(arr))

  }
}
