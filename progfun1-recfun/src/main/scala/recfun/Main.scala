package recfun

object Main {
  def main(args: Array[String]) {
    /*println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }*/
    println(balance(")())(".toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      
      def process(acc: Int, chars: List[Char]): Int = {
        if(chars.isEmpty) acc
        //else if(chars.head == lastFoundBracket) process(acc + 1, lastFoundBracket, chars.tail)
        else if(chars.head == '(') process(acc + 1, chars.tail)
        else if(chars.head == ')' && acc != 0) process(acc - 1, chars.tail)
        else if(chars.head == ')' && acc == 0) process(acc + 1, chars.tail)
        else process(acc, chars.tail)
      }
      process(0, chars) == 0
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      def remainingBal(amount: Int, coins: List[Int], cnt: Int): Int =
        if (amount < 0) cnt 
        else if (coins.isEmpty) {
          if (amount == 0) cnt + 1 else cnt
        } 
        else remainingBal(amount, coins.tail, cnt) + remainingBal(amount - coins.head, coins, cnt)
      remainingBal(money, coins, 0)
    }
  }
