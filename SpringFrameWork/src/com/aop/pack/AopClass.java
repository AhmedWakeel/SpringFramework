package com.aop.pack;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopClass {

/*//	@Before("execution(public String getName())")
//	@Before("execution(public String com.aop.pack.Triangle.getName())")
//	@Before("execution(* com.aop.pack.*.get*())")
//	@Before("allGetters()")
	@Before("allGetters() && allCircleMethods()")
	public void Logging()
	{
		System.out.println("Advice is running for the method ");
	}
	@Pointcut("execution(* get*())")
	public void allGetters()
	{}*/
	
	/*@Before("allCircleMethods()")
	public void circle(JoinPoint joinpoint)
	{
		System.out.println("circle methods "+joinpoint.toString());
	}*/
	
	@Pointcut("execution(*  com.aop.pack.Circle.*(..))")
	public void allCircleMethods()
	{}
	
/*//	@Pointcut("within(com.aop.pack.Circle)")
	@Pointcut("within(com.aop.pack..*)")  // within package and it's subpackages classes
	public void allWithin()
	{}*/
	
	/*@Before("args(name)")
	public void argsName(String name)
	{
		System.out.println(name);
	}
	
	@After("args(name)")
	public void argsAfterName(String name)
	{
		System.out.println(name);
	}*/
	
/*//	@AfterReturning("args(name)")
//	@AfterReturning("execution(* com.aop.pack.Circle.*(..))")
//	@AfterReturning("execution(* com.howtodoinjava.app.service.impl.EmployeeManagerImpl.*(..))")
	@AfterReturning(pointcut="args(name)",returning="ret")
	public void argsAfterReturningName(String name,String ret)
	{
		System.out.println("name in after returning advice "+name+" @@"+ret);
	}*/
	
	/*@AfterThrowing(pointcut="args(name)",throwing="thr")
	public void throwing(String name,RuntimeException thr)
	{
		System.out.println("after throwing "+name+"  "+thr.toString());
	}*/
	
	
	
//	@Around("allCircleMethods()")
	@Around("@annotation(com.aop.pack.Loggable)")
	public void around(ProceedingJoinPoint joinPoint ) 
	{
		try {
			System.out.println("befor advice");
			Circle circle = (Circle) joinPoint.proceed();
			System.out.println("after advice");
		} catch (Throwable e) {
			System.out.println("after throwing");
			e.printStackTrace();
		}
	}
	
	
}
