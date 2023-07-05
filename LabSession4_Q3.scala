object LabSession4_Q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper(_)))
    println(formatNames("Niroshan")(toLower(_)))
    println(formatNames("Saman")(toLower(_)))
    println(formatNames("Kumara")(toUpper(_)))
    }

  def toUpper(str: String): String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  def formatNames(name: String)(func: String => String): String = {
    func(name)
  }
}
