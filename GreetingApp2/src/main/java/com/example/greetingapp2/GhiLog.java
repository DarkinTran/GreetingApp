package com.example.greetingapp2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class GhiLog {

    @After("execution(* K2TinhToanService.cong(..))")
    public void logAfter() {
        System.out.println("Phép cộng đã được thực hiện.");
    }
}
