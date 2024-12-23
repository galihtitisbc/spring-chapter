package org.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("Method : " + methodName + " With Parameter : " + Arrays.asList(args) + " Will Execute");
        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method Executed And Returned : " + returnedByMethod);
        return returnedByMethod;
    }

    //altering parameter and return value
//    @Around("execution(* org.aop.service.*.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object[] arguments = joinPoint.getArgs();
//        Comment comment = new Comment();
//        comment.setText("Another Comment");
//        Object[] newArguments = {comment};
//        Object returnedByMethod = joinPoint.proceed(newArguments);
//        logger.info("Method Executed And Returned : " + returnedByMethod);
//        return "FAILED";
//    }

}
