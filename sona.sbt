ThisBuild / version              := "0.1.1"
ThisBuild / organization         := "net.scalax"
ThisBuild / organizationName     := "Scala Workers"
ThisBuild / organizationHomepage := Some(uri("https://github.com/scala-workers"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    uri("https://github.com/scala-workers/commons-lang3-bridge"),
    "scm:git@github.com:scala-workers/commons-lang3-bridge.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id = "Mars Liu",
    name = "Liu Xin",
    email = "mars.liu@outlook.com",
    url = uri("https://marchliu.github.io/")
  ),
  Developer(
    id = "djx314",
    name = "djx314",
    email = "djx314@sina.cn",
    url = uri("https://github.com/djx314")
  )
)
ThisBuild / description := "Scala Bridge For Apache Commons Lang3 Library"
ThisBuild / licenses    := List(License("Apache", uri("https://github.com/scala-workers/commons-lang3-bridge/blob/master/LICENSE")))
ThisBuild / homepage    := Some(uri("https://github.com/scala-workers/commons-lang3-bridge"))
ThisBuild / pomIncludeRepository := { _ => false } // Remove all additional repository other than Maven Central from POM
ThisBuild / publishMavenStyle    := true
