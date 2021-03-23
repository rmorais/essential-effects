import Dependencies._

ThisBuild / scalaVersion     := "2.13.5"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.cabexas"
ThisBuild / organizationName := "cabexas"

lazy val root = (project in file("."))
  .settings(
    name := "essential-effects"
  )
