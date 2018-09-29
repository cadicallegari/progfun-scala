package reversearray

object Solution {


  def reverseSeq(arr: Array[Int]): Array[Int] = {

    def _reverse(arr: Array[Int], neo: Array[Int], index: Int): Array[Int] = {
      if (index == 0) {
        return neo
      }

      neo(index - 1) = arr(arr.length - index)

      return _reverse(arr, neo, index - 1)
    }

    var neo: Array[Int] = new Array[Int](arr.length)

    return _reverse(arr, neo, arr.length)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)

    reverseSeq(arr).foreach(i => print(s"$i "))
    println()

  }
}
