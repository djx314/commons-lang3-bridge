import sbt.*
import sbt.Keys.*

object CommonSettings {

  // See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
  def scalacOptionsVersion(scalaVersion: Option[(Long, Long)]): Seq[String] = {
    val common = Seq(
      "-unchecked",
      "-deprecation",
      "-encoding",
      "UTF-8"
    )
    val compat = scalaVersion match {
      case Some((2, scalaMajor)) if scalaMajor == 11 => Seq("-Xexperimental", "-Xlint", "-Ywarn-dead-code")
      case _                                         => Seq.empty
    }
    common ++ compat
  }

}
