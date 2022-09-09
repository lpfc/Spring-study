package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author HC
 * @version 1.0
 */
//使用注解方式实现Aop
 @Aspect
// @Component
public class AnnotationPointCut {
  @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
 public void before(){
   System.out.println("======方法执行前=====");
  }
 @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
 public void after(){
  System.out.println("======方法执行后=====");
 }
 //环绕增强中，我们可以给定一个参数，代表我们要获取才处理切入的点
 @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
 public void around(ProceedingJoinPoint jp) throws Throwable {
  System.out.println("环绕前");
  Signature signature = jp.getSignature();//获得签名
  System.out.println(signature+"signature");
  Object proceed = jp.proceed();//执行方法
  System.out.println("环绕后");
 }
}
