name := "PokerHandsScalaKata"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.1" % "test",
  "com.vladsch.flexmark" % "flexmark-all" % "0.35.10" % "test"
)


testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-o"),                           // output to console
  Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports"),    // html report
  Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports")     // xml report
)