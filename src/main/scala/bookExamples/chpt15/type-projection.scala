// src/main/scala/bookExamples/chpt15/type-projection.scala
package bookExamples.chpt15

trait Logger {                                                       // <1>
  def log(message: String): Unit
}

class ConsoleLogger extends Logger {                                 // <2>
  def log(message: String): Unit = println(s"log: $message")
}

trait Service {                                                      // <3>
  type Log <: Logger
  val logger: Log
}

class Service1 extends Service {                                     // <4>
  type Log = ConsoleLogger
  val logger: ConsoleLogger = new ConsoleLogger
}
