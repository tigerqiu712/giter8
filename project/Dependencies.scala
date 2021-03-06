import sbt._

object Dependencies {
  val scalasti = "org.clapper" %% "scalasti" % "2.0.0"
  val jline = "jline" % "jline" % "2.13"
  val commonsIo = "commons-io" % "commons-io" % "2.4"
  val plexusArchiver = "org.codehaus.plexus" % "plexus-archiver" % "2.2" excludeAll(
    ExclusionRule("org.apache.commons", "commons-compress"),
    ExclusionRule("classworlds", "classworlds"),
    ExclusionRule("org.tukaani", "xz"),
    ExclusionRule("junit", "junit")
  )
  // Picking jgit used by sbt-git
  // https://github.com/eclipse/jgit/blob/v3.7.0.201502260915-r/pom.xml
  // This uses httpclient 4.1
  // http://hc.apache.org/httpcomponents-client-4.2.x/
  val jgit = "org.eclipse.jgit" % "org.eclipse.jgit.pgm" % "3.7.0.201502260915-r"
  val scopt = "com.github.scopt" %% "scopt" % "3.5.0"
  val scalacheck = "org.scalacheck" %% "scalacheck" % "1.13.0"
  val sbtIo = "org.scala-sbt" %% "io" % "1.0.0-M6"
}
