package Recusrssion.question3

object sum extends App {

  def sum(x: Int): Int = {
    if (x == 1) 1
    else x + sum(x - 1)
  }

  println("Enetr the number:")
  val b = scala.io.StdIn.readInt()
  println("sum :" + sum(b))

}
