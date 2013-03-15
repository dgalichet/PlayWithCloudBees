import sbt._
import Keys._
import play.Project._
import cloudbees.Plugin._

object ApplicationBuild extends Build {

  val appName         = "PlayWithCloudBees"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies)
  .settings(cloudBeesSettings:_*)
  .settings(
    CloudBees.applicationId := Some("PlayWithCloudBees")
    // Add your own project settings here      
  )
}
