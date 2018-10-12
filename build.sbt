import Dependencies._
import Versions._

lazy val projectSettings = Seq(
  organization := "co.kaisky",
  scalaVersion := projectScalaVersion,
  fork in run := true
)

lazy val root = (project in file("."))
  .settings(
    projectSettings,
    name := "playground",
    version := "0.0.1",
    libraryDependencies ++= dependencies
  )
