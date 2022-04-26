import Dependencies._
import org.scoverage.coveralls.Imports.CoverallsKeys._

//coverallsToken := Some("LI5CiQmQJb1TKRWZSBncQmO3iBNpkkJ2N")
//coverageEnabled := true


ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Coverall_Test",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.typesafe.scala-logging"   %% "scala-logging"                       % "3.8.0",
    )

  )

//import org.scoverage.coveralls.Imports.CoverallsKeys._
//
//coverallsToken := Some("fBtj5f9yY8JE7NLbArDuAqVDhbkycxMV8nkLY")

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
