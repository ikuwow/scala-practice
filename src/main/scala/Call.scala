package com.ikuwow.scalapractice.main

import com.ikuwow.scalapractice.model._

object Call { // object means
  def sayHello(name: String = "Jigglipuff", age: Int = 14): Unit = { // Unit means "void"
    println(s"Hello, $name. You are $age years old")
  }

  final def main(args: Array[String]): Unit = {
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

    val cathy = User(name = "Cathy") // use instance method (apply() is used)
  }
}
