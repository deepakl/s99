package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P11Spec extends Properties("P11") {

  import edu.dlewis.P11._

  property("encodeModified") = forAll { (a: Char, b: Char, c: Char) =>
    encodeModified(Seq(a, a, b, b, c, a, a)) == Seq((2, a), (2, b), c, (2, a))
  }
}