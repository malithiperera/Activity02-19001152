
object prime extends App {
def prime(num:Int,x:Int=2): Boolean =
  {
    if(num==x) true

    else
      if(num%x==0) false
      else prime(num,x+1)
  }
  println("Enter the number:")
  val b=scala.io.StdIn.readInt()
println(prime(b))

}
