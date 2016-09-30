package edu.dlewis

object P13 {
  def encodeDirect(input: Seq[Char]): Seq[(Int, Char)] = {
    input.foldRight(Seq.empty[(Int, Char)]) {
      case (x, Nil) => Seq((1, x))
      case (x, (count, y) :: tail) if x == y => (count + 1, x) +: tail
      case (x, acc) => (1, x) +: acc
    }
  }
}
