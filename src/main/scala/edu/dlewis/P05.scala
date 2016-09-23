package edu.dlewis

import scala.annotation.tailrec

object P05 {

  def reverseRecursive(input: Seq[Int]): Seq[Int] = {
    @tailrec
    def reverse(input: Seq[Int], output: Seq[Int]): Seq[Int] = input match {
      case Nil => input
      case head +: Nil => output :+ head
      case init :+ last => reverse(init, output :+ last)
    }
    reverse(input, Seq.empty)
  }

  def reverseFunctional(input: Seq[Int]): Seq[Int] = input.foldRight(Seq.empty[Int]) { (c, acc) => acc :+ c }
}
