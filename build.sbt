import org.scalatra.sbt._
import sbt.Project.projectToRef

ThisBuild / scalaVersion := "2.13.6"
name := "ScalaJS with Scalatra"
version := "1.0.0"

val client = project.in(file("client")).settings(
  libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0",
  
  scalaJSStage.in(Global) := FastOptStage,
  Seq(fastOptJS, fullOptJS) map { packageJSKey =>
    Compile / packageJSKey / crossTarget := (server / baseDirectory).value / "src/main/webapp/assets/js"
  }
)
.enablePlugins(ScalaJSPlugin)

lazy val server = project.in(file("server")).settings(
  scalaVersion := "2.13.6",
  sourcesInBase := false,
  libraryDependencies ++= Seq(
    "org.scalatra" %% "scalatra" % "2.7.0",
    "org.scalatra" %% "scalatra-specs2" % "2.7.0" % "test",
    "org.scalatra" %% "scalatra-json" % "2.7.0",
    //scalatra 2.7.0 needs is built against json4s-jackson 3.5!
    "org.json4s" %% "json4s-jackson" % "3.5.5",
    //See https://www.eclipse.org/jetty/ for compatible jetty/servlet-api combinations 
    "org.eclipse.jetty" % "jetty-webapp" % "10.0.3" % "container;provided",
    //5.0.0 changes packg id to jakarta.... instead of javax... scalatra cannot deal with it (yet) 
    "jakarta.servlet" % "jakarta.servlet-api" % "4.0.3" % "container,test,provided" //one '%'!
  ),

  Test / testOptions += Tests.Argument(TestFrameworks.Specs2, "junitxml", "console"),
  packageOptions += Package.MainClass("JettyLauncher")
)
.enablePlugins(JettyPlugin)

addCommandAlias("compileAll", "; server/compile; client/fastOptJS")
addCommandAlias("jetty", "~jetty:stop;jetty:start")