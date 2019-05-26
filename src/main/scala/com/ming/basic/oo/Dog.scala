package com.ming.basic.oo

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年05月26 18时39分
  */
class Dog extends Animal{

  var name: String = "123";


  def this(name: String){
    this();
    this.name = name;
  }

  override def run(): Unit = {
    println("狗跑...")
  }

  override def sing(): Unit = {
    println("狗叫...")
  }


}

object  Dog{
  def main(args: Array[String]): Unit = {
    val dog  = new Dog("豆豆")
    println(dog.name)
    dog.run()
    dog.sing()

  }
}
