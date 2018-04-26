name := "scala-slick-mssql"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
  "com.microsoft.sqlserver" % "mssql-jdbc" % "6.2.1.jre8"
)
