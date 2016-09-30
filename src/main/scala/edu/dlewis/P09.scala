package edu.dlewis

object P09 {

  def packTail(input: Seq[Char]): Seq[Seq[Char]] = {
    input.foldLeft(Seq.empty[Seq[Char]]) {
      case (Nil, x) => Seq(Seq(x))
      case (acc, x) if x == acc.last.last => acc.init :+ (acc.last :+ x)
      case (acc, x) => acc :+ Seq(x)
    }
  }

  def pack(input: Seq[Char]): Seq[Seq[Char]] = {
    input.foldLeft(Seq.empty[Seq[Char]]) {
      case (Nil, x) => Seq(Seq(x))
      case (acc, x) if x == acc.head.head => (x +: acc.head) +: acc.tail
      case (acc, x) =>  Seq(x) +: acc
    }.reverse
  }
}
