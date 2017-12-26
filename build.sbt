name := "Iteration5"

version := "1.0"

scalaVersion := "2.12.4"


libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.specs2" %% "specs2-core" % "3.8.6" % Test,
  "com.typesafe.akka" %% "akka-actor" % "2.5.8",
 "com.typesafe.akka" %% "akka-testkit" % "2.5.8" % Test,
  "org.scala-lang.modules" % "scala-async_2.12" % "0.9.7"
)
