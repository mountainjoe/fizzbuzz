object FizzBuzz {

  var fizzdiv = 3
  var buzzdiv = 5
  
  def config(fd:Int,bd:Int) = {
    fizzdiv = fd
    buzzdiv = bd
  }
  
  def main(args: Array[String]): Unit = {
    printFizzBuzz(1,100)
  }
  
  def printFizzBuzz(start:Int,end:Int) = { 
    makeFizzBuzzList(start,end).map(x => println(x))
  }
  
  def makeFizzBuzzList(start:Int,end:Int) = {
    (start to end).map(x => fizzbuzzify(x))
  }
  
  def fizzbuzzify(x:Int) =
    if ( (x % fizzdiv == 0) && (x % buzzdiv == 0))
      "fizzbuzz"
    else if (x % fizzdiv == 0) 
      "fizz"
    else if (x % buzzdiv == 0)
      "buzz"
    else
      x.toString()
}