package com.ming.basic.function

/**
  * @description:
  *               高阶函数
  *               高阶函数（Higher-Order Function）就是操作其他函数的函数。
  *               Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/6/3 19:00
  */
object HigherOrderFunction {

  def main(args: Array[String]): Unit = {
    println(apply(layout,10))
  }


  def apply(f:Int => String,v:Int) = {
    f(v)
  }

  def layout[A](x: A) = {
    "[" + x.toString() + "]"
  }

}
