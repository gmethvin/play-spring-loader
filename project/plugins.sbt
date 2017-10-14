logLevel := Level.Warn

val InterplayVersion = sys.props.get("interplay.version").getOrElse("1.3.12")
val SbtReleaseVersion = "1.0.6"

addSbtPlugin("com.typesafe.play" % "interplay" % InterplayVersion)
addSbtPlugin("com.github.gseitz" % "sbt-release" % SbtReleaseVersion)