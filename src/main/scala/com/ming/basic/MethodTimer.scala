package com.ming.basic

/**
  * @description: 一切皆对象之函数为对象
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/24 10:22
  */
object MethodTimer {

  // def 定义函数关键字
  def oncePerSecond(callback:()=>Unit): Unit ={
    while (true){
      callback();
      Thread.sleep(1000);
    }
  }

  def timeFlies(): Unit ={
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    // 将函数作为对象参数传递
    oncePerSecond(timeFlies)
  }


}
