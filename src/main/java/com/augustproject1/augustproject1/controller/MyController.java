package com.augustproject1.augustproject1.controller;

import com.augustproject1.augustproject1.MyImplementation.MyImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @Autowired
    private MyImplementation myImplementation;        //and always use @Autowired annotation on above the field of the class which is
                                                        //defining the methods and have the @Service annotation above it
    @GetMapping(value = "/getdata")
    String str(){                                       //we are calling the methods at this class
        String str=myImplementation.getdata();          //always use @RestContrller annotation above the class which
        return str;                                     //will call the methods and @Service annotation above the class
    }                                                   //which is implementing the interface and defining the methods

    @GetMapping(value = "/addition")
    public int addition(){
        int add1=myImplementation.add();
        return add1;
    }

    @GetMapping(value = "/substraction")
    int sub(){
        int sub1=myImplementation.sub();
        return sub1;
    }

    @GetMapping(value = "/multiplication")
    int mul(){
        int mul1=myImplementation.mul();
        return mul1;
    }

    @GetMapping(value = "/division")
    int div(){
        int div1=myImplementation.div();
        return div1;
    }
}
