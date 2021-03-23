import sbt._
import sbt.Keys.libraryDependencies

object Dependencies extends AutoPlugin {

  override def trigger = allRequirements

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    libraryDependencies ++= cats
      ++ catsEffect
      ++ Seq(munit).map(_ % Test)
  )

  lazy val munit = "org.scalameta" %% "munit" % "0.7.22"

  val cats = Seq(
    "org.typelevel" %% "cats-core" % "2.4.2"
  )

  val catsEffect = Seq(
    "org.typelevel" %% "cats-effect" % "2.4.0"
  )
}
