name := "commons-lang3-bridge"

libraryDependencies ++= libScalax.`commons-lang3`.value.map(_ % Provided)
libraryDependencies ++= libScalax.scalatest.value.map(_ % Test)
libraryDependencies ++= libScalax.`kind-projector`.value
libraryDependencies ++= List("net.scalax.simple" %% "simple-adt" % "0.0.2-M14") // libScalax.`simple-adt`.value

CommonSettings.commonProjectSettings
