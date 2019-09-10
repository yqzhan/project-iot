package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectiot {

        ProjectiotDelegate projectiotDelegate = new ProjectiotDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectiotDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}