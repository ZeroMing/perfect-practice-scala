package com.ming.basic.generic

import com.ming.basic.implicit_.{Girl, MingPredef}

/**
  * @description: 上下文界定
  * - 必须传进去一个隐式转换的值
  * - 必须传进去一个隐式转换的值
  * - 必须传进去一个隐式转换的值
  * @author: Li Ming
  * @date: 2019年06月02 10时48分
  */
class GenericContext {

}
object GenericContext{
  def main(args: Array[String]): Unit = {
    import MingPredef._
    val selector = new Selector[Girl]
    val girl1 = new Girl("Angel",100)
    val girl2 = new Girl("Liuyifei",999)

    println(selector.choose(girl1,girl2).name)

  }
}


class Selector[T : Ordering]{

  def choose(first:T,second:T)={
    // 隐式参数
    val ord = implicitly[Ordering[T]]
    if(ord.gt(first,second)){
      first
    }else{
      second
    }
  }
}
