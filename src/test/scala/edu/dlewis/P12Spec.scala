package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}


object P12Spec extends Properties("P12") {

  import edu.dlewis.P12._

  val nonZeroInt = Gen.choose(1, 100)

  property("decode") = forAll(nonZeroInt, Gen.alphaChar, nonZeroInt, Gen.alphaChar) { (countA: Int, a: Char, countB: Int, b: Char) =>
    decode(Seq((countA, a), (countB, b))) == Seq.fill(countA)(a) ++ Seq.fill(countB)(b)
  }
}