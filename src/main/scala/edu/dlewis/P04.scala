package edu.dlewis

import scala.annotation.tailrec

object P04 {

  def lengthRecursive(input: Seq[Int]): Int = {
    @tailrec
    def length(input: Seq[Int], count: Int): Int = input match {
      case Nil => count
      case head +: tail => length(tail, count + 1)
    }
    length(input, 0)
  }

  def lengthFunctional(input: Seq[Int]): Int = input.foldLeft(0) { (c, _) => c + 1 }
}
