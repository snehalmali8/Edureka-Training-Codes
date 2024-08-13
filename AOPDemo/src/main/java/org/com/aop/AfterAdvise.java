package org.com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
@Configuration
@Aspect
public class AfterAdvise {
	@After("execution(* org.com.aop.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method:" + joinPoint);
		System.out.println("Arguments: "+ joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	@After("execution(* org.com.aop.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint) {
		System.out.println("Interceped method: "+ joinPoint);
		System.out.println("Arguments: "+ joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	
}
