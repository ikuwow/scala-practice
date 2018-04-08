package com.ikuwow.scalapractice.model

class User(final val name: String = "anonymous") { // Capital, companion class
  // val name = _name // not needed
  def sayHi() = println("hi! " + this.name)
}

object User { // companion object
  def getInfo = println("This is User Object")
  def apply(name: String) = new User(name)
}

final class AdminUser(name: String, val age: Int) extends User(name) {
  def sayHello() = println(s"hello! $name ($age)")
  override def sayHi = println("hi admin")
}
