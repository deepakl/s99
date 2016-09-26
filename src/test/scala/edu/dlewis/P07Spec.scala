package edu.dlewis

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object P07Spec extends Properties("P07") {

  import edu.dlewis.P07._

  property("flattenRecursive") = forAll { seq: Seq[Int] =>
    val flatten1: Seq[Any] = flattenRecursive(seq :+ seq)
    flatten1 == seq ++ seq
  }

  property("flattenRecursive 2") = forAll { (seq1: Seq[Int], seq2: Seq[Int], seq3: Seq[Int]) =>
    val flatten1: Seq[Any] = flattenRecursive(Seq(seq1 :+ seq2, seq3, seq1 :+ seq2 :+ seq3))
    flatten1 == seq1 ++ seq2 ++ seq3 ++ seq1 ++ seq2 ++ seq3
  }

  property("flattenFunctional") = forAll { seq: Seq[Int] =>
    val flatten1: Seq[Any] = flattenFunctional(seq :+ seq)
    flatten1 == seq ++ seq
  }
}