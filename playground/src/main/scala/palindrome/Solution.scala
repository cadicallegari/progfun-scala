package palindrome

import scala.util.control.Breaks
import scala.collection.mutable.Queue
import scala.collection.mutable.Stack

//class Solution {
class Solution {
  private val q: Queue[Char] = Queue.empty[Char]
  private val s: Stack[Char] = Stack.empty[Char]

  //Write your code here
  def pushCharacter(c: Char) = s.push(c)

  def popCharacter(): Char = s.pop()

  def enqueueCharacter(c: Char) = q.enqueue(c)

  def dequeueCharacter(): Char = q.dequeue()
}

object Solution {
  def main(args: Array[String]) {
    // read the string s
    var s = scala.io.StdIn.readLine()
    // create the Solution class object p
    var obj = new Solution();
    var i = 0;
    var len = s.length();
    //push/enqueue all the characters of string s to stack
    for (i <- 0 to len - 1) {
      obj.pushCharacter(s(i));
      obj.enqueueCharacter(s(i));
    }

    var isPalindrome = true;
    /*pop the top character from stack
          dequeue the first character from queue
          compare both the characters*/

    val loop = new Breaks;
    loop.breakable {
      for (i <- 0 to len / 2) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
          isPalindrome = false;
          loop.break;
        }
      }
    }

    //finally print whether string s is palindrome or not
    if (isPalindrome) {
      println("The word,", s, ", is a palindrome.");
    } else {
      println("The word,", s, ", is not a palindrome.");
    }
  }
}
