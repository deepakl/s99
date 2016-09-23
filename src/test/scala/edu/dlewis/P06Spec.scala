package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P06Spec extends Properties("P06") {

  import edu.dlewis.P06._

  property("isPalindrome") = forAll { seq: Seq[Int] =>
    isPalindrome(seq ++ seq.reverse)
  }
}