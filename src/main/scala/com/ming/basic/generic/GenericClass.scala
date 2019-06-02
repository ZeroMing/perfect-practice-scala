package com.ming.basic.generic

/**
  * @description: 泛型类
  * @author: Li Ming
  * @date: 2019年06月01 09时25分
  */
object  GenericClass{
  def main(args: Array[String]): Unit = {
//    val student = new Student[String, Int, String]("张三")
//    student.age = 1
//    student.sex = "男"
//    student.say()
//    println(student.gt("Haddop","Spark"))


    // 会报错:上界限定出错
    //val student1 = new Student[Int, Int, String](987)
    val student2 = new Student[Integer, Int, String](987)


  }

}

/**
  * 泛型类
  * @param name
  * @tparam T1
  * @tparam T2
  * @tparam T3
  */
class Student[T1 <: Comparable[T1], T2, T3](val name: T1) {
  var age: T2 = _
  var sex: T3 = _
  def say() = {
    println(name)
  }

  def gt(first:T1,second:T1) ={
    if(first.compareTo(second) > 0)
      first
    else
      second
  }
}


