package com.ming.basic

/**
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/24 10:41
  */
class ClassesWithArguments(real:Double,imaginary:Double){

  // 返回类型会由编译器根据右边的类型自动推断为Double
  def im() = imaginary;

  /**
    *  无参的方法，完全可以作为成员变量定义
    *
    */
  def re= real;


  /**
    *
    */
  override def toString() =
    "" + re + (if (im < 0) "-" else "+") + im + "i"

}

object ComplexNumbers{
  def main(args:Array[String]): Unit ={
    val  complexNumbers = new ClassesWithArguments(10,20);
    // 调用中需要与定义的地方相对应，如果定义中方法没有括号，调用中需要保持一致
    println(complexNumbers re)
    println(complexNumbers im())
  }

}
