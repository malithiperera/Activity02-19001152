package Recusrssion.question5

object sumEven extends App {

  def sumEven(n: Int): Int = {
    if (n == 0) 0
    else if (n % 2 != 0) sumEven(n - 1)

    else n + sumEven(n - 2)


  }

  println("Enter the number:")
  val b = scala.io.StdIn.readInt()
  println("Sum of Even numbers till entered number: " + sumEven(b))

}
