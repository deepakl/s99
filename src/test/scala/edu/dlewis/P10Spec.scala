package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P10Spec extends Properties("P10") {

  import edu.dlewis.P10._

  property("encode") = forAll { (a: Char, b: Char, c: Char) =>
    encode(Seq(a, a, b, b, c, a, a)) == Seq((2, a), (2, b), (1, c), (2, a))
  }
}