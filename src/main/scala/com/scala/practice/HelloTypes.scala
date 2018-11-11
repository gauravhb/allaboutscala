package com.scala.practice

object HelloTypes extends App{

  println("Step 1: Declare a variable of type Any")
val favoriteDonut: Any = "Glazed Donut"
 println(s"donut of type Any = $favoriteDonut")

  println("Step 2: Declare a variable of type AnyRef")
  val favoriteDonut2: AnyRef = "Glazed Donut"
  println(s"donut of type AnyRef = $favoriteDonut2")

  println("Step 3: Declare a variable of type AnyVal")
  val favoriteDonut3: AnyVal = 2.5
  println(s"donut of type AnyVal = $favoriteDonut3")

}