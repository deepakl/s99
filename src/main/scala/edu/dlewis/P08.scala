package edu.dlewis

object P08 {

  def compress(input: Seq[Char]): Seq[Char] = {
    input.foldLeft(Seq.empty[Char]) { (acc, cur) => (acc, cur) match {
      case (Nil, x) => acc :+ x
      case (acc, x) if x == acc.last => acc
      case (_, x) => acc :+ x
    }
    }
  }
}
