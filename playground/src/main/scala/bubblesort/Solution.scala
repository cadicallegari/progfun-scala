package bubblesort

object Solution {

  def sort(a: Array[Int]): (Int, Int, Int) = {
    var numberOfSwaps: Int = 0

    for (_ <- a.indices) {

      for (j <- 0 until a.length - 1) {
        if (a(j) > a(j + 1)) {
          val tmp = a(j)
          a(j) = a(j + 1)
          a(j + 1) = tmp
          numberOfSwaps += 1
        }

      }

    }

    (numberOfSwaps, a(0), a(a.length - 1))
  }

  def main(args: Array[String]) {
    val sc = scala.io.StdIn
    var n = sc.readInt()
    var a = new Array[Int](n)
    for (a_i <- 0 until n - 1) {
      a(a_i) = sc.readInt()
    }

    // Write Your Code Here
    val (swaps, first, last) = sort(a)

    println(f"Array is sorted in $swaps swaps.")
    println(f"First Element: $first")
    println(f"Last Element: $last")
  }
}
