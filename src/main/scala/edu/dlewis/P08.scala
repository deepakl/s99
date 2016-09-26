package edu.dlewis

object P08 {

  def compress(input: Seq[Char]): Seq[Char] = {
    input.foldLeft(Seq.empty[Char]) {
      case (Nil, x) => Seq(x)
      case (acc, x) if x == acc.last => acc
      case (acc, x) => acc :+ x
    }
  }
}
