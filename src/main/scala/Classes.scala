package com.ikuwow.scalapractice.model

class User(val name: String = "anonymous") { // Capital
  // val name = _name // not needed
  def sayHi() = println("hi! " + this.name)
}

class AdminUser(name: String, val age: Int) extends User(name) {
  def sayHello() = println(s"hello! $name ($age)")
  override def sayHi = println("hi admin")
}
