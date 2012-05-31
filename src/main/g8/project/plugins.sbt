scalaVersion := "2.9.1"

addSbtPlugin("cc.spray" % "sbt-twirl" % "0.5.2")

addSbtPlugin("com.eed3si9n" % "sbt-appengine" % "$sbt_appengine_version$")

resolvers ++= Seq(
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
  "spray repo" at "http://repo.spray.cc",
  Resolver.url("sbt-plugin-releases",
    url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
)
