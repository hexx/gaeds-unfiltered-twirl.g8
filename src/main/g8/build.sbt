organization := "$org_id$"

name := "$name$"

version := "$version$"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "com.github.hexx" %% "gaeds" % "0.1.0",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.mortbay.jetty" % "jetty" % "6.1.26" % "container"
)

seq(appengineSettings: _*)

seq(Twirl.settings: _*)
