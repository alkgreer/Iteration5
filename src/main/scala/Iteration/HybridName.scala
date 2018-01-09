package Iteration

object HybridName {

  def apply(f: String, l: String): String = f + "-" + l

  def unapply(h: String): Option[(String,String)] = {
    val hyphenSplit = h.split("-")
    if (hyphenSplit.size == 2) Some((hyphenSplit(0), hyphenSplit(1))) else None
  }

}

import Iteration._
object HybridNameTest {

  def nameMatch(name: String): Boolean = name match {
    case HybridName(f, l) if f == "Alisha" || l == "Greer" => true
    case _ => false
  }

  def main(args: Array[String]) = {
    val Name = HybridName.apply("Alisha", "Greer")
    println(Name + ": " + nameMatch(Name))
    val HybridName(fName, lName) = Name
    println(s"First Name: $fName\nLast Name: $lName")
    val noHyphen = HybridName.unapply(Name)
    println(noHyphen)
  }

}
