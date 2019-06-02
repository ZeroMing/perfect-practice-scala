package com.ming.basic.akka

import java.util.UUID

import akka.actor.{Actor, ActorSelection}

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年05月28 23时01分
  */
class Worker extends  Actor{

  //Worker端持有Master端的引用（代理对象）
  var master: ActorSelection = null
  //生成一个UUID，作为Worker的标识
  val id = UUID.randomUUID().toString

  //构造方法执行完执行一次
  override def preStart(): Unit = {
    //Worker向MasterActorSystem发送建立连接请求
    master = context.actorSelection("akka.tcp://MasterActorSystem@127.0.0.1:8888/user/Master")
    //Worker向Master发送注册消息
    master ! "connect"
  }

  //该方法会被反复执行，用于接收消息，通过case class模式匹配接收消息
  override def receive: Receive = {
    //Master向Worker的反馈信息
    case "reply" => {
      println(" a reply from master")
    }
  }
}
