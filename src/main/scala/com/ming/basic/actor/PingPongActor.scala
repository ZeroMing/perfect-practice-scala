package com.ming.basic.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年05月26 23时57分
  */

case object PingMessage
case object PongMessage
case object StartMessage
case object StopMessage


class Ping(pong: ActorRef) extends Actor {

  var count = 0
  def incrementAndPrint { count += 1; println("ping") }
  def receive = {
    case StartMessage =>
      incrementAndPrint
      pong ! PingMessage
    case PongMessage =>
      if (count > 9) {
        sender ! StopMessage
        println("ping stopped")
        context.stop(self)
      } else {
        incrementAndPrint
        sender ! PingMessage
      }
  }
}

class Pong extends Actor {
  def receive = {
    case PingMessage =>
      println(" pong")
      sender ! PongMessage
    case StopMessage =>
      println("pong stopped")
      context.stop(self)
      // 旧版本方法
      //context.system.shutdown()
      context.system.terminate()
  }
}

object PingPongActor extends App {
  val system = ActorSystem("PingPongSystem")
  val pong = system.actorOf(Props[Pong], name = "pong")
  val ping = system.actorOf(Props(new Ping(pong)), name = "ping")
  // start them going
  ping ! StartMessage
}
