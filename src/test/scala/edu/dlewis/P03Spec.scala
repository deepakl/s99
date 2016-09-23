package edu.dlewis

import edu.dlewis.P03._
import org.scalacheck.Prop._
import org.scalacheck.Properties

object P03Spec extends Properties("P03") {

  property("nth") = forAll { (index: Int, seq: Seq[Int]) =>
    val output: Option[Int] = nth(index, seq)
//    val output: Option[Int] = nth(1, Vector(0, 1))
    if (index >= 0 && index < seq.length) {
      output == Some(seq(index))
    } else {
      output.isEmpty
    }
  }
}