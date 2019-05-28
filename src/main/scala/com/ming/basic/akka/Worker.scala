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
    master = context.system.actorSelection("akka.tcp://MasterActorSystem@192.168.10.1:8888/user/Master")
    //Worker向Master发送注册消息
    master ! RegisterWorker(id, "192.168.10.1", 10240, 8)
  }

  //该方法会被反复执行，用于接收消息，通过case class模式匹配接收消息
  override def receive: Receive = {
    //Master向Worker的反馈信息
    case RegisteredWorker(masterUrl) => {
      import context.dispatcher
      //启动定时任务，向Master发送心跳
      context.system.scheduler.schedule(0 millis, 5000 millis, self, SendHeartBeat)
    }

    case SendHeartBeat => {
      println("worker send heartbeat")
      master ! HeartBeat(id)
    }
  }
}
