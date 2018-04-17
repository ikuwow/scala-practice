object Other {
  def swap(a: Int, b: Int) = (b, a)

  def main(args: Array[String]): Unit = {
    // touple
    val data = (12, "ikuwow", 60)
    println(data._1)
    println(data._3)
    val (x, y) = swap(30, 20)
    println(x)
    println(y)
  }
}
