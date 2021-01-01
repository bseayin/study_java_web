package com.xsz;

/**
 * Simple POJO to be referenced from a Service Activator.
 *
 * @author Mark Fisher
 */
public class HelloService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}
