object FunctionObject {

  // method
  def multiply(a: Int, b: Int) = a * b


  def msg(from: String, to: String, text: String) = s"($from -> $to): $text"

  def main(args: Array[String]): Unit = {

    // Function object
    // val multiplyFunc: (Int, Int) => Int = (a: Int, b: Int) => a * b
    // val multiplyFunc = (a: Int, b: Int) => a * b
    val multiplyFunc = (_: Int) * (_: Int)
    println(multiplyFunc(3, 4))
    println(multiplyFunc(5, 6))

    val multiplyFuncCurried = (a: Int) => ((b: Int) => a * b)
    println(multiplyFuncCurried(3)(5))

    val double = multiplyFuncCurried(2)
    val tripple = multiplyFuncCurried(3)
    println(double(4))
    println(tripple(7))

    println(msg("ikuwow", "degawa", "Hello"))
    println(msg("hoge", "degawa", "GOod"))

    // 部分適用
    // val mstToDegawa = msg(_: String, "degawa", _: String)
    val msgFunc = msg _ // method to function object

    println(msgToDegawa("ikuwow", "Hello"))
  }
}
