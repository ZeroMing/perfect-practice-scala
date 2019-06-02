package com.ming.basic.generic

/**
  * @description:
  * @author: Li Ming
  * @date: 2019年06月01 11时18分
  */

// 道生一,一生二,二生三,三生万物
class DAO
class ONE extends  DAO
class TWO extends ONE
class THREE extends TWO
class ALL extends THREE

object GenericUpAndDown{
  def main(args: Array[String]): Unit = {
    val dao = new DAO
    val one = new ONE
    val two = new TWO
    val three = new THREE
    val all = new ALL

    println("************上界**************")
    val up = new Up[ONE]
    up.say(one)
    up.say(two)
    up.say(three)
    up.say(all)
    //up.say(dao) //报错 Type mismatch, expected: ONE, actual: DAO
    println("************下界*************")


    val down = new Down[DAO]
    down.say(one)
    down.say(two)
    down.say(three)
    down.say(all)
    down.say(dao)
    // 运行时出错
    /***
      * do not conform to class Down's type parameter bounds [T >: com.ming.basic.generic.ONE]
      * val down2 = new Down[TWO]
      */
    //val down2 = new Down[TWO]

  }
}



//<: 上边界，即泛型T只能是C1及其子类
class Up[T <: ONE] {
  def say(p: T) = {
    println(p.getClass)
  }
}

//<: 下边界，即泛型T只能是C1_1_1及其父类
class Down[T >: ONE] {
  def say(p: T) = {
    println(p.getClass)
  }
}


class GenericUpAndDown {
  /**
    * [T <: UpperBound]     上界绑定
    * [T >: LowerBound]     下界绑定
    * @param first
    * @param second
    * @tparam T
    * @return
    */
  def compare[T<:Comparable[T]](first:T,second:T)={
    val result=if(first.compareTo(second)>0) 1 else 0
    result
  }

  def say[T1,T2,T3]( name:T1, age:T2):T3 = {
    (name + "-" + age).asInstanceOf[T3]
  }


}
