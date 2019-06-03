package com.ming.basic.function

/**
  *
  * Scala 中定义匿名函数的语法很简单，箭头左边是参数列表，右边是函数体。
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/6/3 19:11
  */
object NoNameFunction {
  def main(args: Array[String]): Unit = {

    var inc = (x:Int) => x+1
    var dec = (x:Int) => x-1
    var mul = (x:Int,y:Int) => x * y
    

  }

}
