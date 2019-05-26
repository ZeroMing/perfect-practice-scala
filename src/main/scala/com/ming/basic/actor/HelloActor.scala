package com.ming.basic.actor

import akka.actor.{Actor, ActorSystem, Props}

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年05月26 23时53分
  */
class HelloActor extends Actor {

  def receive = {

    case "hello" => println("您好！")
    case _ => println("您是?")
  }
}
object Main extends App {
  val system = ActorSystem("HelloSystem")
  // 缺省的Actor构造函数
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "喂"
}