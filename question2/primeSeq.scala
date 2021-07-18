

object primeSeq extends App{
  def primeSeq(y:Int,x:Int=2): Boolean =
  {

    if(x==y) true

    else
      if(y%x==0) false
      else primeSeq(y,x+1)
  }


  println("Enter the number:")
  val b=scala.io.StdIn.readInt()
  var i=0;
  for (i<-2 until b )
  {
    if(primeSeq(i,2)==true) {
      print(i+ " ")
    }
  }
}




