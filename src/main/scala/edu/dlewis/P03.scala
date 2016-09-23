package edu.dlewis

import scala.annotation.tailrec

object P03 {

  @tailrec
  def nth[T](index: Int, input: Seq[T]): Option[T] = (index, input) match {
    case (_, Nil) => None
    case (x, _) if x < 0 || x >= input.length => None
    case (0, head +: tail) => Some(head)
    case (_, head +: tail) => nth(index - 1, tail)
  }
}
