package com.ming.basic.currying

/**
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/29 19:18
  */
class CurryingClass {





}

object  CurryingClass{
  def main(args: Array[String]): Unit = {

    println(add_1(1)(2))

    val str1:String = "Hello, "
    val str2:String = "Scala!"
    println( "str1 + str2 = " +  strcat(str1)(str2) )
  }


  def add(x:Int,y:Int)=x+y


  /**
    * 函数 柯里化
    * add(1)(2) 实际上是依次调用两个普通函数（非柯里化函数），
    * 第一次调用使用一个参数 x，返回一个函数类型的值，
    * 第二次使用参数y调用这个函数类型的值。
    *
    * 实质上最先演变成这样一个方法：
    *
    * def add(x:Int)=(y:Int)=>x+y
    *
    * 意思是: 接收一个x为参数，返回一个匿名函数，该匿名函数的定义是：接收一个Int型参数y，函数体为x+y。
    *
    * @param x
    * @param y
    * @return
    */
  def add_1(x:Int)(y:Int) = x + y


  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }




}
