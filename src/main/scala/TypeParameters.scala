class MyData[T] {
  def getFour(value: T) = println(s"$value $value $value")
}

object TypeParameters {
  final def main(args: Array[String]): Unit = {
    val smd = new MyData[String]
    smd.getFour("ora")

    val imd = new MyData[Int]
    imd.getFour(4)
  }
}
