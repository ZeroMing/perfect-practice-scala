package com

/**
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/24 10:07
  */
class HelloScala {

  def sayHello(x: String): Unit = {
    println("hello," + x);
  }

}
// 伴生对象
object HelloScala{
  def main(args: Array[String]): Unit = {
    val helloScala = new HelloScala
    helloScala.sayHello("Scala")
  }
}
