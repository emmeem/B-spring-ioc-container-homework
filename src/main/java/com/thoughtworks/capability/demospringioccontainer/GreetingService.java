package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;


import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
@Scope(value = SCOPE_PROTOTYPE)
public class GreetingService {

    public GreetingService() {
        System.out.println("+++++++ GreetingService is instantiating...");
    }

    String sayHi() {
        return "hello world";
    }
}
