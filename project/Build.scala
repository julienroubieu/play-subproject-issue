import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "playapp"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore
  )

  val asubproject = Project("asubproject", file("sub"))


  val main = play.Project(appName, appVersion, appDependencies, path = file("playapp")).settings(
    // Add your own project settings here      
  ).dependsOn(asubproject).aggregate(asubproject)

}
