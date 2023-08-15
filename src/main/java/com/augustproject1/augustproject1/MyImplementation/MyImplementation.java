package com.augustproject1.augustproject1.MyImplementation;

import com.augustproject1.augustproject1.repo.InterfaceDemo;
import org.springframework.stereotype.Service;

@Service
public class MyImplementation implements InterfaceDemo {
    @Override
    public String getdata() {                   //at this class we are implementing the interface and
        return "Hello Spring";                  // defining the methods and calling them in controller class
    }                                           //the class which is defining the methods should have the @Service annotation
                                    //that the beans of this class should be available
    @Override
    public int add() {
        int a=89;
        int b=34;
        return a+b;
    }

    @Override
    public int sub() {
        int a=54;
        int b=23;
        return a-b;
    }

    @Override
    public int div() {
        int a=34;
        int b=43;
        return a/b;
    }

    @Override
    public int mul() {
        int a=45;
        int b=23;
        return a*b;
    }
}
