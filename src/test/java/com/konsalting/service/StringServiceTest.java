package com.konsalting.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringServiceTest {

    @Autowired
    private StringService service;

    @Test
    public void StringService(){
        String s = "aaaaabcccc";
        String result = "\"a\": 5,\"c\": 4,\"b\": 1";
        Assert.assertEquals(result,service.countSymbols(s));
    }

    @Test
    public void StringService1(){
        String s = "a";
        String result = "\"a\": 1";
        Assert.assertEquals(result,service.countSymbols(s));
    }

    @Test
    public void StringServiceVoidString(){
        String s = "";
        String result = "пустая строка";
        Assert.assertEquals(result,service.countSymbols(s));
    }


}
