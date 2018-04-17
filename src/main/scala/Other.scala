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

    // Set
    val answers = Set(5, 3, 8, 5)
    println(answers) // 5, 3, 8
    println(answers.contains(3))
    println(answers(3))

    val validAnswers = Set(3, 5, 7, 9)
    println(answers & validAnswers)
    println(answers | validAnswers)
    println(answers &~ validAnswers)
  }
}
