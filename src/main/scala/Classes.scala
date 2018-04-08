package com.ikuwow.scalapractice.model

class User(final val name: String = "anonymous") extends Sharable with Printable { // Capital, companion class
  // val name = _name // not needed
  override def getInfo() = super[Printable].getInfo
  def sayHi() = println("hi! " + this.name)
}

object User { // companion object
  def apply(name: String) = new User(name)
}

final class AdminUser(name: String, val age: Int) extends User(name) {
  def sayHello() = println(s"hello! $name ($age)")
  override def sayHi = println("hi admin")
}

trait Printable {
  def getInfo() = println("printing...")
}

trait Sharable {
  def getInfo() = println("sharing...")
}
