package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P09Spec extends Properties("P09") {

  import edu.dlewis.P09._

  property("pack") = forAll { (a: Char, b: Char, c: Char) =>
    packHead(Seq(a, a, b, b, c, a, a)) == Seq(Seq(a, a), Seq(b, b), Seq(c), Seq(a, a))
  }
}