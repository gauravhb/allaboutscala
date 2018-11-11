package com.scala.practice

import com.typesafe.scalalogging.LazyLogging

object HelloWorld extends App with LazyLogging{
println("Hello World from Scala!!")

  println("Command line args are :")
  println(args.mkString(","))

  logger.info("Implemented logging in hello world")
}
