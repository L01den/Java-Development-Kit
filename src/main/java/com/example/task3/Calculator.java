package com.example.task3;

import java.awt.image.DataBufferUShort;

public class Calculator {

    public static <T extends Number, K extends Number> Double sum(T first, K second){
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number, K extends Number> Double multiply(T first, K second){
        return first.doubleValue() * second.doubleValue();
    }

    public static <T extends Number, K extends Number> Double divide(T first, K second){
        return first.doubleValue() / second.doubleValue();
    }

    public static <T extends Number, K extends Number> Double subtract(T first, K second){
        return first.doubleValue() - second.doubleValue();
    }

//    , (), (), ()
}
