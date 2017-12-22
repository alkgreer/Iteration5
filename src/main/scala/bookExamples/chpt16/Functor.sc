// src/main/scala/bookExamples/chpt15/Functor.sc
import scala.language.higherKinds
import bookExamples.chpt15.Functor._

List(1,2,3) map2 (_ * 2)               // List(2, 4, 6)
Option(2) map2 (_ * 2)                 // Some(4)
val m = Map("one" -> 1, "two" -> 2, "three" -> 3)
m map2 (_ * 2)                         // Map(one -> 2, two -> 4, three -> 6)
