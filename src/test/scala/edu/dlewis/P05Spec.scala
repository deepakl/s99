package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P05Spec extends Properties("P05") {
  import edu.dlewis.P05._

  property("reverseRecursive") = forAll { seq: Seq[Int] =>
    reverseRecursive(seq) == seq.reverse
  }

  property("reverseFunctional") = forAll { seq: Seq[Int] =>
    reverseFunctional(seq) == seq.reverse
  }
}