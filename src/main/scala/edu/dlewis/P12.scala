package edu.dlewis

object P12 {

  def decode(input: Seq[(Int, Char)]): Seq[Char] = {
    input.flatMap { case (count, char) => Seq.fill(count)(char) }
  }
}
