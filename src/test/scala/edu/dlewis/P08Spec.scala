package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P08Spec extends Properties("P08") {

  import edu.dlewis.P08._

  property("compress") = forAll { seq: Seq[Char] =>
    compress(seq.flatMap(c => Seq(c, c))) == seq
  }
}