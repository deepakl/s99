package edu.dlewis

import scala.annotation.tailrec

object P07 {

  def flattenRecursive(input: Seq[Any]): Seq[Any] = {
    def flattenSingle(input: Any, acc: Seq[Any]): Seq[Any] = input match {
      case s: Seq[Any] => acc ++ flatten(s, Seq.empty)
      case o => acc :+ o
    }

    @tailrec
    def flatten(input: Seq[Any], acc: Seq[Any]): Seq[Any] = input match {
      case Nil => acc
      case head +: tail => flatten(tail, flattenSingle(head, acc))
    }

    flatten(input, Seq.empty)
  }

  def flattenFunctional(input: Seq[Any]): Seq[Any] = {
    input.foldLeft(Seq.empty[Any]) { (acc, element) =>
      element match {
        case e: Seq[Any] => acc ++ flattenFunctional(e)
        case single => acc :+ single
      }
    }
  }
}
