package com.ming.basic.actor

import akka.actor.Actor
import akka.actor.UntypedActor;

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年05月26 23时11分
  */


class MingActor extends  Actor{

  override def receive: Receive = {
      case "start" => {
        println("starting ...")
        Thread.sleep(5000)
        println("started")
      }
      case "stop" => {
        println("stopping ...")
        Thread.sleep(5000)
        println("stopped ...")
      }
  }
}

object MingActor{
  def main(args: Array[String]) {

    val actor = new MingActor
    actor.preStart()

    /*actor.
    actor ! "stop"*/
    println("消息发送完成！")
  }
}
