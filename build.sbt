name := "commercial-shared"

organization := "com.gu"

bintrayOrganization := Some("guardian")

bintrayRepository := "frontend"

licenses += ("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "com.gu" % "content-api-models-scala" % "11.12",
  "com.gu" %% "fapi-client" % "2.0.13",
  "org.scalatest" %% "scalatest" % "3.0.3" % Test,
  "net.liftweb" %% "lift-json" % "3.0.1" % Test
)
