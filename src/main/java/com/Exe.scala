package com

/**
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/24 09:58
  */
object Exe {

  // object 所声明的是一个单例对象。
  // Scala中不存在静态成员方法或字段



  // 方法签名: 参数:类型;返回值为空使用Unit
  def main(args: Array[String]): Unit = {
    val  hello = new Hello;
    hello.sayHello("后羿")
  }




  // 一切都是对象
}
