package binarynumbers

object Solution {

  def continuousOnes(n: Int): Int = {

    def countContinuous(s: Seq[Int],
                        index: Int = 0,
                        max: Int = 0,
                        current: Int = 0): Int = {

      if (s.length == 1 && s(1) == 1) {
        return 1
      }

      if (index >= s.length) {
        return max
      }

      var c = current
      if (s(index) == 1) {
        c += 1
      } else {
        c = 0
      }

      var m = max
      if (m < c) {
        m = c
      }

      countContinuous(s = s, index = index + 1, max = m, current = c)
    }

    def toBinary(i: Int, bSeq: Seq[Int] = Seq.empty[Int]): Seq[Int] = {
      if (i <= 0) {
        return bSeq
      }

      toBinary(i / 2, (i % 2) +: bSeq)
    }

    countContinuous(toBinary(n))
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    println(continuousOnes(n))
  }
}
