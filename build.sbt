import org.apache.logging.log4j.core.config.composite.MergeStrategy

name := "yoWorld"

version := "0.1"

scalaVersion := "2.13.1"

//"com.sun.jersey" % "jersey-core" % "1.8",
//"com.sun.jersey" % "jersey-server" % "1.8",
//"com.sun.jersey" % "jersey-json" % "1.8",

//libraryDependencies += "com.sun.jersey" % "jersey" % "0.8-ea"
libraryDependencies += "org.glassfish.jersey.core" % "jersey-client" % "2.29.1"
libraryDependencies += "org.glassfish.jersey.containers" % "jersey-container-jetty-http" % "2.29.1"
libraryDependencies += "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.29.1"
libraryDependencies += "org.glassfish.jersey.inject" % "jersey-hk2" % "2.29.1"
libraryDependencies += "javax.ws.rs" % "javax.ws.rs-api" % "2.1.1"

//lazy val commonSettings = Seq(
//  version := "0.1-SNAPSHOT",
//  organization := "kidgercorp",
//  scalaVersion := "2.13.1",
//  test in assembly := {}
//)
//
//assemblyMergeStrategy in assembly := {
//  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
//  case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
//  case "application.conf"                            => MergeStrategy.concat
//  case "unwanted.txt"                                => MergeStrategy.discard
//  case x =>
//    val oldStrategy = (assemblyMergeStrategy in assembly).value
//    oldStrategy(x)
//}

//lazy val app = (project in file("app")).
//  settings(commonSettings: _*).
//  settings(
//    mainClass in assembly := Some("src/main/scala/main.scala"),
//    // more settings here ...
//  )
//
//lazy val utils = (project in file("utils")).
//  settings(commonSettings: _*).
//  settings(
//    assemblyJarName in assembly := "utils.jar",
//    // more settings here ...
//  )