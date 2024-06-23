package com.evilcorp.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AspetLogg {

    @AfterReturning(value = "execution(* com.evilcorp.aspect.SumController.sumIJ*(..))", returning = "result")
    public void logBeforeSum(JoinPoint joinPoint, Object result){
        System.out.println("Метод "+ joinPoint.getSignature().getName() + " был вызван");
        log.info("Результат суммирования - " + result + ";");
    }

    @Before("execution(* com.evilcorp.aspect.SumController.setI*(..))")
    public void logBeforSetI(JoinPoint joinPoint){
        System.out.println("Метод "+ joinPoint.getSignature().getName() + " был вызван");
        log.info("Переменная i равна " + joinPoint.getArgs()[0] + ";");
    }

    @Before("execution(* com.evilcorp.aspect.SumController.setJ*(..))")
    public void logBeforSetJ(JoinPoint joinPoint){
        System.out.println("Метод "+ joinPoint.getSignature().getName() + " был вызван");
        log.info("Переменная j равна " + joinPoint.getArgs()[0] + ";");
    }
}
