package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@AfterReturning(
			  pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
			  returning="result")
	public void afterReturningFindAccountsAdvise(
				JoinPoint theJoinPoint, List<Account> result) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
		
		System.out.println("\n=====>>> result is: " + result);
		
		convertAccountNamesToUpperCase(result);
		
		System.out.println("\n=====>>> result is: " + result);
		
	}
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for (Account tempAccount : result) {
			
			String theUpperName = tempAccount.getName().toUpperCase();
			
			tempAccount.setName(theUpperName);
		}
		
	}
	
}


