-- file: fizzbuzz.hs

fizzbuzzify :: Int -> String
fizzbuzzify x 
   | mod x 15 == 0 = "FizzBuzz"
   | mod x  3 == 0 = "Fizz"
   | mod x  5 == 0 = "Buzz"
   | otherwise   = show x

main = mapM_ (putStrLn . fizzbuzzify) [1..100]
