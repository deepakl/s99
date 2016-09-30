package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P13Spec extends Properties("P13") {

  import edu.dlewis.P13._

  property("encode") = forAll { (a: Char, b: Char, c: Char) =>
    encodeDirect(Seq(a, a, b, b, c, a, a)) == Seq((2, a), (2, b), (1, c), (2, a))
  }
}