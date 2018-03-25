object Conditional {
  def main(args: Array[String]): Unit = {
    val timestamp = System.currentTimeMillis
    if (timestamp % 2 == 0) {
      println("even")
    } else {
      println("odd")
    }

    // if returns value
    val result =
      if (timestamp % 2 == 0) {
        "even"
      } else {
        "odd"
      }
    println(result)

    val signal = "asdf"
    val result2 = signal match {
      case "red" => "stop"
      case "blue" | "green" => {
        "go"
      }
      // case _ => "OH"
      case other => s"MOO: $other"
    }
    println(result2)
  }
}

