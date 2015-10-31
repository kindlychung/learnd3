enablePlugins(ScalaJSPlugin)

name := "learnD3"

version := "1.0"

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  //  "com.lihaoyi" %%% "autowire" % "0.2.5",
  //  "com.lihaoyi" %%% "upickle" % "0.3.6",
  //  "com.lihaoyi" %%% "scalatags" % "0.5.2",
  //  "com.lihaoyi" %%% "scalarx" % "0.2.8",
  "fr.iscpif" %%% "scaladget" % "0.7.0",
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)

///////////////////// live reload //////////////////////////////////
workbenchSettings

// live reload needs to know where to begin
//bootSnippet := "tutorial.webapp.TutorialApp().main();"
//bootSnippet := "tutorial.webapp.Sierpinski().main(document.getElementById('canvas'));"
bootSnippet := "tutorial.webapp.LearnD3().main(document.getElementById('d3'))"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)
///////////////////// live reload end //////////////////////////////////