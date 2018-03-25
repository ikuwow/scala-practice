object MyApp { // same classname to filename is not needed
  def main(args: Array[String]): Unit = {
    // Variables
    // - val: like constant, immutable
    // - var: variable, mutable
    val message = "Hello\tWorld" // message: String
    println(message)

    // variables
    val i = 5
    val l = 54321L // long
    val d = 4.3 // double, 4.3l
    val c = '3'
    val s = "string"
    val flag = true // false

    val x = 10
    println( x / 3.0 )

    println(s"x: $x, " + s"x+1: ${x+1}")
    println(f"number: $x%s")
  }
}
