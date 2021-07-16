package Recusrssion.question6

object fibsum extends App {
  def fibsum(x: Int): Int = x match {

    case x if (x == 0) => 0
    case x if (x == 1) => 1
    case _ => fibsum(x - 1) + fibsum(x - 2)
  }

  println("Enetr terms to print Fibonacci Sequence:")
  val b = scala.io.StdIn.readInt()
  var i = 0
  for (i <- 0 until b) {
    print(fibsum(i) + "  ")
  }

}
