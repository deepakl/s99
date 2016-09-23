package edu.dlewis

object P06 {

  import P05._

  def isPalindrome(input: Seq[Int]): Boolean = input == reverseRecursive(input)
}
