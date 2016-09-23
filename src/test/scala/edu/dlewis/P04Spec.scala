package edu.dlewis

import edu.dlewis.P04._
import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P04Spec extends Properties("P04") {

  property("lengthRecursive") = forAll { seq: Seq[Int] =>
    lengthRecursive(seq) == seq.length
  }

  property("lengthFunctional") = forAll { seq: Seq[Int] =>
    lengthFunctional(seq) == seq.length
  }
}