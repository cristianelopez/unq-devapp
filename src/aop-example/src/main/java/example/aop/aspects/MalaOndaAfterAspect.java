package example.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class MalaOndaAfterAspect {

    @AfterReturning("execution(* comprar(..))")
    public void zaraza() {
        System.out.println("Maldito Bastardo ..");
    }
}