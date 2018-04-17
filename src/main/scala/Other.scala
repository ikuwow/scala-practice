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

    // Collection: Seq (List, ...), Set, Map

    // val scores = List[Int](10, 20, 30)
    // val scores = List(10, 20, 30)
    val scores = 10 :: 20 :: 30 :: Nil
    println(scores.length)
    println(scores.isEmpty)
    println(scores.head)
    println(scores(2))
  }
}
