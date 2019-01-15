package listreplication

object Solution {

  def f(num: Int, arr: List[Int]): List[Int] = {
    arr.map(x => List.fill(num)(x)).flatten
  }

  def main(args: Array[String]) {
//    case class Entry(N: Int, K: Int)
//
//    val stdin = scala.io.StdIn
//
//    val N = stdin.readLine.trim.toInt
//
//    val data = for (_ <- 1 to N) yield {
//      val splited = stdin.readLine.split(" ")
//
//      Entry(splited(0).toInt, splited(1).toInt)
//    }
//
//    data.map(x => doProcess(x.N, x.K)).map(println)

  }
}
