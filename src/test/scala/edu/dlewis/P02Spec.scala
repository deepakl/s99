package edu.dlewis

import edu.dlewis.P02._
import org.scalacheck.Prop._
import org.scalacheck.Properties

import scala.util.Try

object P02Spec extends Properties("P02") {

  property("last") = forAll { seq: Seq[Int] =>
    penultimate(seq) == Try(seq.init.last).toOption
  }
}