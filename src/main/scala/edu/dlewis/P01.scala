package edu.dlewis

import scala.annotation.tailrec

object P01 {

  @tailrec
  def last[T](input: Seq[T]): Option[T] = input.toList match {
    case Nil => None
    case head :: Nil => Some(head)
    case head :: tail => last(tail)
  }
}
