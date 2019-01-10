package nestedlogic

import java.time.{LocalDate, ZoneId}
import java.text.SimpleDateFormat

object Solution {

  val MaxFine = 10000
  val MonthFineTax = 500
  val DayFineTax = 15

  case class Dt(d: Int, m: Int, y: Int)

  def calculateFine(expected: Dt, returned: Dt): Int = {
    if (returned.y > expected.y) {
      return MaxFine
    }

    if (returned.d > expected.d) {
      if (returned.m == expected.m && returned.y == expected.y) {
        return (returned.d - expected.d) * DayFineTax
      }
    }

    if (returned.m > expected.m && (returned.y == expected.y)) {
      return (returned.m - expected.m) * MonthFineTax
    }

    0
  }

  def stringToDate(str: String): Dt = {
    val splited = str.split(" ")
    Dt(splited(0).toInt, splited(1).toInt, splited(2).toInt)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val re = stdin.readLine
    val ex = stdin.readLine

    println(calculateFine(stringToDate(ex), stringToDate(re)))

  }
}
