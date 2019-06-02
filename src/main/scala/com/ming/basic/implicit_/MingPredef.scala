package com.ming.basic.implicit_

import java.io.File

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年06月02 10时47分
  */
object MingPredef {

  // 隐式转换声明定义
  implicit def fileToRichFile(file:File) = new RichFile(file)

  // 写法1
/*  implicit def girlToOrderedGirl(girl:Girl) = new Ordered[Girl]{
    override def compare(that: Girl): Int = {
      girl.faceValue - that.faceValue
    }
  }*/

  // 写法2
/*  implicit val girlToOrderedGirl = (girl:Girl) => new Ordered[Girl]{
    override def compare(that: Girl): Int = {
      girl.faceValue - that.faceValue
    }
  }*/


  // 实例
  /*implicit val GirlToOrderingGirl = new Ordering[Girl]{
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }*/

  // 写法2
  trait girl2Ordering extends Ordering[Girl]{
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }
  implicit  object  girl extends girl2Ordering

}
