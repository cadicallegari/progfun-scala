package evenodds

object Solution {


  def evenOdds(src: String): (String, String) = {

    def _evenOdds(src: String, evens: String, odds: String, index: Int): (String, String) = {
      if (index >= src.length) {
        return (evens, odds)
      }

      if (index % 2 == 0) {
        return _evenOdds(src, evens + src.charAt(index), odds, index + 1)
      }

      return _evenOdds(src, evens, odds + src.charAt(index), index + 1)

    }


    return _evenOdds(src, "", "", 0)
  }


  def loop(times: Int, index: Int): Int = {
    if (index >= times) {
      return index
    }

    val line = scala.io.StdIn.readLine()
    val (evens, odds) = evenOdds(line)
    println(s"$evens $odds")


    return loop(times, index + 1)
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT.
       Your class should be named evenodds.Solution
    */
    val n = scala.io.StdIn.readInt()

    loop(n, 0)

  }
}