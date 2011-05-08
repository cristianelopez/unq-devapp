package ar.edu.unq.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BuenaOndaAdviceAspect {

    @Around("execution(* comprar(..))")
    public Object aroundSaludar(final ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Buenas tardes, encantado de concerlo ... ");
        try {
            return pjp.proceed();
        } finally {
            System.out.println("Gracias, que tenga un buen día .. hasta luego ");
        }

    }

}
