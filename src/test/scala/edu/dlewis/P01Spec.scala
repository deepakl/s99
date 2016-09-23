package edu.dlewis

import edu.dlewis.P01._
import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

import scala.util.Try

object P01Spec extends Properties("P01") {

  property("last") = forAll { seq: Seq[Int] =>
    last(seq) == Try(seq.last).toOption
  }
}