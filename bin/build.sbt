lazy val root = (project in file("."))
  .settings(

  kotlinLib("stdlib"),

  // Project name (artifact name in Maven)
  name := "(kotlin-cli-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  //javacOptions ++= Seq("-source", "1.6", "-target", "1.6"),

  //scalacOptions += "-target:jvm-1.6",

  kotlincOptions += "-target:jvm-17",

  // project description
  description := "Kotlin Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
  libraryDependencies += "org.springframework.boot" % "spring-boot-starter" % "2.6.3",

  mainClass := Some("example.AppKt")
)
