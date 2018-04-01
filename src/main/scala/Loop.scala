object Loop {
  def main(args: Array[String]): Unit = {

    println("while:")
    var i = 0;
    while (i < 10) {
      println(i)
      i += 1 // no i++ in scala
    }

    do {
      println(i)
      i -= 1
    } while (i > 0)

    println("for:")
    val result = for (i <- 0 to 3; j <- 1 until 5; if i != j) yield s"$i, $j"
    for (r <- result) {
      println(r)
    }
  }

}
