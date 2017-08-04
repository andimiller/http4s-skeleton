name := "does-doobie-do-mysql"

version := "1.0"

scalaVersion := "2.12.2"

resolvers ++= Seq(
  "tpolecat" at "http://dl.bintray.com/tpolecat/maven",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

lazy val doobieVersion = "0.4.1"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.tpolecat"   %% "doobie-core-cats" % doobieVersion,
  "mysql" % "mysql-connector-java" % "5.1.43",
  "org.http4s" %% "http4s-core" % "0.17.0-SNAPSHOT",
  "org.http4s" %% "http4s-dsl" % "0.17.0-SNAPSHOT",
  "org.http4s" %% "http4s-blaze-server" % "0.17.0-SNAPSHOT"
)