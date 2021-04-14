package com.aop.borrowbooks.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Increase {
    @After("execution(* com.aop.borrowbooks.controller.*)")
    public void callMethod() {

    }
}
