package edu.dlewis

object P11 {
  import P10._

  def encodeModified(input: Seq[Char]): Seq[Any] = {
    encode(input).map {
      case (1, x) => x
      case y => y
    }
  }
}
