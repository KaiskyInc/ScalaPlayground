import Versions._
import sbt._

object Dependencies {
  lazy val playJson = "com.typesafe.play" %% "play-json" % playJsonVersion
  lazy val alpakkaSqs = "com.lightbend.akka" %% "akka-stream-alpakka-sns" % alpakkaVersion

  lazy val dependencies = Seq(
    playJson,
    alpakkaSqs
  )
}
