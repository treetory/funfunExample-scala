package io.funfun.redbook

object LearnScala {

  def helloWorld(): Unit = {
    println("Hello, world!")
  }

  def variableAndCalculate(): Unit = {
    println( 1 + 2 )
    println( (1).+(2) )
  }

  def main(args: Array[String]): Unit = {
    helloWorld()
    variableAndCalculate()
  }

}
