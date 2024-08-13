package org.com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
@Configuration
@Aspect
public class BeforeAdvise {
	// and using it get the method signature or the target object. we can use argument expression in the pointcut to be applied to any method
	// that matches argument pattern.If we use this we need to use the same name in the advise method from where the argument type is determined.
	
	@Before("execution(* org.com.aop.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method:" + joinPoint);
		System.out.println("Arguments: "+ joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	@Before("execution(* org.com.aop.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint) {
		System.out.println("Interceped method: "+ joinPoint);
		System.out.println("Arguments: "+ joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	
	//PointCut  - mark a function as a pointcut 
	// execution = expression covering method on which advise is applied
}
