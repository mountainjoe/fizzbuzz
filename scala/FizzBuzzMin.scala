object FizzBuzzMin extends App {
	(1 to 100).map(x =>
	  if ( (x % 3 == 0) && (x % 5 == 0))
	    "fizzbuzz"
	  else if (x % 3 == 0)
	    "fizz"
	  else if (x % 5 == 0)
	    "buzz"
	  else 
	    x.toString()
	).map(x => println(x))
}