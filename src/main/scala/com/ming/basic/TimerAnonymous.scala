package com.ming.basic

/**
  * @description: TODO-Eden.Lee
  * @author: Eden.Lee/李明
  * @company: 朴新教育
  * @date: 2019/5/24 10:36
  */
object TimerAnonymous {
  // def 定义函数关键字
  def oncePerSecond(callback:()=>Unit): Unit ={
    while (true){
      callback();
      Thread.sleep(1000);
    }
  }

  def main(args: Array[String]): Unit = {

    // 匿名对象处理
    oncePerSecond(()=>{
      println("time flies like an arrow...")
    })


  }

}
