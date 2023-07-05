object LabSession4_Q1 {
  def main(args: Array[String]): Unit = {
    println("Interest: " + interest(5450))
  }

  def interest(deposit: Double): Double = {
    val interestRate = {
      if (deposit <= 20000){
        0.02
      }else if (deposit <= 200000){
        0.04
      }else if (deposit <= 2000000) {
        0.035
      }else{
        0.065
      }
    }

    deposit * interestRate
  }
  }



