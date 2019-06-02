package com.ming.basic.generic

import com.ming.basic.implicit_.{Girl, MingPredef}

/**
  * 1、可以无痛扩展原有程序的功能
  * 2、弱耦合
  *
  * @description: 视图界定
  * - 必须传进去一个隐式转换的 函数函数函数
  * - 必须传进去一个隐式转换的 函数函数函数
  * - 必须传进去一个隐式转换的 函数函数函数
  * @author: Li Ming
  * @date: 2019年06月02 10时48分
  */
class GenericView {

}

object  GenericView{
  def main(args: Array[String]): Unit = {
    import MingPredef._
    val chooser = new Chooser[Girl]
    val girl1 = new Girl("Angel",100)
    val girl2 = new Girl("Liuyifei",999)

    println(chooser.choose(girl1,girl2).name)
  }
}


class Chooser[T <% Ordered[T]]{
  def choose(first:T,second:T)={
    if(first >second){
      first
    }else{
      second
    }
  }
}
