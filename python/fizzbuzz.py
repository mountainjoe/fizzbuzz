#! /usr/bin/env python

fizzdiv = 3
buzzdiv = 5

def fizzbuzzify(num):
   if (num % fizzdiv == 0) and (num % buzzdiv == 0):
      return "fizzbuzz"
   elif num % fizzdiv == 0:
      return "fizz"
   elif num % buzzdiv == 0:
      return "buzz"
   else:
      return str(num)

def makefblist(start,finish):
   return [fizzbuzzify(x) for x in range(start,finish+1)]

def printfblist(start,finish):
   for x in makefblist(start,finish):
      print x

def fizzbuzz():
   """Standard 1 to 100 fizz buzz printer"""
   printfblist(1,100)


fizzbuzz()
