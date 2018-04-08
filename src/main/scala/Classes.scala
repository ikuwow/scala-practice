class User(val name: String = "anonymous") { // Capital
  // val name = _name // not needed
  def sayHi() = println("hi! " + this.name)
}

class AdminUser(name: String, val age: Int) extends User(name) {
  def sayHello() = println(s"hello! $name ($age)")
  override def sayHi = println("hi admin")
}

object Classes {

  def sayHello(name: String = "Jigglipuff", age: Int = 14): Unit = { // Unit means "void"
    println(s"Hello, $name. You are $age years old")
  }

  def main(args: Array[String]): Unit = {
    sayHello("ikuwow", 27)
    sayHello(age = 80, name = "Gold")
    sayHello(age = 2)

    // val user: User = new User
    val tom = new User("tom")
    println(tom.name)
    tom.sayHi

    val unnamed = new User
    unnamed.sayHi

    val bob = new AdminUser(name = "bob", age = 33)
    bob.sayHello
    bob.sayHi
  }

}
