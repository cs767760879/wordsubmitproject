package com.gupao.pattern.designmode.factory.abstractfactory;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public class ComputerFactoryTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new HuaWeiComputerFactory();
        computerFactory.createCharger();
        computerFactory.createComputer().watchTelevision();
    }
}
