// src/main/scala/bookExamples/chpt17/future-fold.sc
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global

val futures = (0 to 9) map {                                         // <1>
  i => Future {
    val s = i.toString                                               // <2>
    print(s)
    s
  }
}

val f = Future.reduceLeft(futures)((s1, s2) => s1 + s2)                  // <3>

val n = Await.result(f, Duration.Inf)                                // <4>
