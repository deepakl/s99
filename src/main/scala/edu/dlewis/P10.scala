package edu.dlewis

object P10 {
  import P09._

  def encode(input: Seq[Char]): Seq[(Int, Char)] = {
    pack(input).map(seq => (seq.size, seq.head))
  }
}
