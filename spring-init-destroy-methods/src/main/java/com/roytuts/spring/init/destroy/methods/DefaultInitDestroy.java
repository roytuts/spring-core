package com.roytuts.spring.init.destroy.methods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.context.annotation.Bean;

@Retention(RetentionPolicy.RUNTIME)
@Bean(initMethod = "init", destroyMethod = "destroy")
public @interface DefaultInitDestroy {

}
