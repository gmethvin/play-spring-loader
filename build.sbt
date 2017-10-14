
organization := "com.lightbend.play"
name := "play-spring-loader"

playBuildRepoName in ThisBuild := "play-spring-loader"
releaseCrossBuild := true

val PlayVersion = "2.6.6"
val SpringVersion = "4.3.11.RELEASE"

lazy val root = (project in file(".")).enablePlugins(PlayLibrary)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % PlayVersion,
  "org.springframework" % "spring-context" % SpringVersion
)
