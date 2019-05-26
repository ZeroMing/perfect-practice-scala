package com.ming.basic.function

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年05月26 14时31分
  */
class MingFunction {


  // 写法1: 需要推断类型
  val function1 = (x:Int) => x * 10;

  // 写法2：可以清晰看出输入参数和返回参数的类型
  val function2 : Int=>Int = {
    x => x * 10;
  }


  /**
    *
    * @param func 函数参数。输入值为Int，输出值为Int
    * @return
    */
  def handle(func: Int => Int,value: Int): Int={
    func(value);
  }
}


object  MingFunction{
  def main(args: Array[String]): Unit = {

    val mingFunction  = new MingFunction
    val res = mingFunction.handle(mingFunction.function1,6);
    println(res)
    val res2 = mingFunction.handle(mingFunction.function2,6);
    println(res2)
  }



}