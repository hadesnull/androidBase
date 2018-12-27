package com.example.qianfei.mybaseandroid.strategy;

/**
 * Created by qf on 2018/12/6
 * 描述: StrategyMain
 */
public class StrategyMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setCar(new MOtoCar());
        person.getCar().run();
    }
}
