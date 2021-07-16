package Recusrssion.question4

object isEven extends App {

  def isEven(x: Int): Boolean = {
    if (x % 2 == 0) true
    else false
  }

  def isOdd(n: Int): Boolean = !(isEven(n))


  println("Enetr the number to know even :")
  val b = scala.io.StdIn.readInt()
  println(isEven(b))

  println("Enetr the number to know odd :")
  val a = scala.io.StdIn.readInt()
  println(isOdd(a))


}
