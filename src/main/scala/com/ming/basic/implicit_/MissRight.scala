package com.ming.basic.implicit_

/**
  * @description: 柯里化 实现视图绑定
  * @author: Li Ming
  * @date: 2019年06月02 12时26分
  */
class MissRight[T] {

  // 相当于视图界定ViewBound ???
  def choose(first:T,second:T)(implicit order:T => Ordered[T])={
    if(first > second){
      first
    }else{
      second
    }
  }


  // 相当于上下文界定ContextBound
  def select(first:T,second:T)(implicit order :Ordering[T])={
    if(order.gt(first,second)){
      first
    }else{
      second
    }
  }

  // 相当于上下文界定ContextBound
  def random(first:T,second:T)(implicit order :Ordering[T])={
    import Ordered.orderingToOrdered
    if(first > second){
      first
    }else{
      second
    }
  }




}
