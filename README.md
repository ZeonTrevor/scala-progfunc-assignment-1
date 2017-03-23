# scala-progfunc-assignment-1
Functional Programming in Scala - Assignment 1

## Exercise 1 - Pascal Triangle
Implement a pascal function, which takes a column c and a row r, counting from 0 and returns the number at that spot in the triangle. For example, pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3.

```scala
def pascal(c: Int, r: Int): Int
```
## Exercise 2 - Parentheses Balancing
Implement a recursive function which verifies the balancing of parentheses in a string, which is represented as a List[Char] not a String. For example, the function should return true for the following strings:

* (if (zero? x) max (/ 1 x))
* I told him (that it’s not (yet) done). (But he wasn’t listening)

The function should return false for the following strings:

* :-)
* ())(

Function signature:
```scala
def balance(chars: List[Char]): Boolean
```

## Exercise 3 - Counting Change
Implement a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations.

For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

Function signature:
```scala
def countChange(money: Int, coins: List[Int]): Int
```
