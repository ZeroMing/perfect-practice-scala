package com.ming.basic.implicit_

import java.io.File

import scala.io.Source
//  导入隐式转换定义
import MingPredef._
/**
  * @description:
  * @author: Li Ming
  * @date: 2019年06月02 11时01分
  */

//隐式的增强File类的方法
class RichFile(val from: File){

  def read() = Source.fromFile(from).mkString

}


object  RichFile{
  def main(args: Array[String]): Unit = {
    val file = new File("D://list.txt");
    val contents = file.read()
    println(contents)

  }
}