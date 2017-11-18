name := "scala_dl4j_example"

version := "1.0"

scalaVersion := "2.10.5"

parallelExecution in test := false


resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

val dl4jVer = "0.7.2"
libraryDependencies ++= Seq(
  "org.deeplearning4j" %  "arbiter-deeplearning4j"          % dl4jVer,
  "org.datavec"        %  "datavec-api"                     % dl4jVer,
  "org.datavec"        %  "datavec-data-codec"              % dl4jVer,
  "org.datavec"        %% "datavec-spark"                   % dl4jVer,
  "org.deeplearning4j" %% "dl4j-spark"                      % dl4jVer,
  "org.nd4j"           %  "nd4j-native"                     % dl4jVer,
  "org.nd4j"           %  "nd4j-native-platform"            % dl4jVer,
  "org.deeplearning4j" %  "rl4j-gym"                        % dl4jVer,

  "org.apache.spark"  % "spark-core_2.10"              % "1.3.1" % "provided",
  "org.apache.spark"  % "spark-mllib_2.10"             % "1.3.1",
  "org.apache.spark"  % "spark-graphx_2.10"            % "1.3.1",
  "com.databricks"    % "spark-csv_2.10"               % "1.3.0",
  "org.scalaz" % "scalaz-core_2.10" % "7.2.16",

  "com.google.guava"          %  "guava"           % "19.0",
  "org.apache.httpcomponents" %  "httpclient"      % "4.3.5",
  "com.twelvemonkeys.imageio" % "imageio-core"     % "3.3.2",
  "com.beust"                 %  "jcommander"      % "1.27",
  "org.jfree"                 %  "jcommon"         % "1.0.23",
  "jfree"                     %  "jfreechart"      % "1.0.13"
)