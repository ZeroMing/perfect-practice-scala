package com.ming.basic.generic

/**
  * @description: 泛型函数
  * @author: Li Ming
  * @date: 2019年06月01 09时25分
  */
class GenericFunction {
  def say[T1,T2,T3]( name:T1, age:T2):T3 = {
    (name + "-" + age).asInstanceOf[T3]
  }
}


object  GenericFunction{

  def main(args: Array[String]): Unit = {
    val p = new GenericFunction
    println(p.say("张三", 12))//scala会自动推断泛型的实际类型
    println(p.say[String,Int,String]("李四", 14))//等同于上面
  }

}