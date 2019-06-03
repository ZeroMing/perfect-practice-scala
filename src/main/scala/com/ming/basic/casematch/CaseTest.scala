package com.ming.basic.casematch

/**
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/29 18:23
  */
class CaseTest{

}

object CaseTest {

  def main(args: Array[String]): Unit = {

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }


  }


  /**
    * 模式匹配，关键字 <case>
    * @param x
    * @return
    */
  def matchCase(x: Int): String = x match {
    case  1 => "one"
    case  2 => "two"
    case  _ => "many"
  }



  def matchCaseClass(x: Int): String = x match{
    case  1 => "one"
    case  2 => "two"
    case  _ => "many"
  }


  /**
    * - 构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
    * - 在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
    * - 提供unapply方法使模式匹配可以工作；
    * - 生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。
    * @param name
    * @param age
    */
  case class Person(name: String,age: Int)


}



