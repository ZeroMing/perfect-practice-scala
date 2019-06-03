package com.ming.basic.function

import java.util.Date

/**
  * Scala 偏应用函数是一种表达式，你不需要提供函数需要的所有参数，只需要提供部分，或不提供所需参数。
  *
  * @description:
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/29 19:24
  */
object PartialFunctionTest {

  def main(args: Array[String]): Unit = {
    var date = new Date
    // 偏应用函数优化以上方法，绑定第一个 date 参数，第二个参数使用下划线(_)替换缺失的参数列表
    // 并把这个新的函数值的索引的赋给变量
    val logWithDateBound = log(date,_:String)
    logWithDateBound("message1")
  }


  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }


}

