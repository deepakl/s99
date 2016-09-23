package edu.dlewis

import edu.dlewis.P01._

object P02 {
  def penultimate[T](input: Seq[T]): Option[T] = input match {
    case Nil => None
    case head +: Nil => None
    case init :+ l => last(init)
  }
}
