object Loop {
  def main(args: Array[String]): Unit = {
    var i = 0;
    while (i < 10) {
      println(i)
      i += 1 // no i++ in scala
    }

    do {
      println(i)
      i -= 1
    } while (i > 0)
  }
}
