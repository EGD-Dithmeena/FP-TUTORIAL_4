import scala.io.StdIn

object LabSession4_Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter an integer number")
    var value = StdIn.readInt()
    println("The input is: " + patternMatching(value))
  }

  def patternMatching(x: Int): String = x match{
    case x if x <= 0 => "Negative/Zero"
    case x if x % 2 == 0 => "Even"
    case x if x % 2 != 0 => "Odd"
  }

}
