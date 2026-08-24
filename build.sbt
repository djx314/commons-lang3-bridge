val `modules/file` = file(".").getCanonicalFile / "modules"

val bridge = (project in `modules/file` / "bridge")
  .settings(
    name               := "commons-lang3-bridge",
    scalafmtOnCompile  := true,
    crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3),
    scalaVersion       := scalaV.v212,
    publishTo          := localStaging.value,
    scalacOptions      := CommonSettings.scalacOptionsVersion(CrossVersion.partialVersion(scalaVersion.value))
  )
  .settings(
    libraryDependencies ++= libScalax.`commons-lang3`.value.map(_ % Provided),
    libraryDependencies ++= libScalax.scalatest.value.map(_ % Test),
    libraryDependencies ++= libScalax.`simple-adt`.value,
    useKindProjector
  )

Global / onChangedBuildSource := ReloadOnSourceChanges
