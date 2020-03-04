
package com.mx.bookstore;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mx.bookstore.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

