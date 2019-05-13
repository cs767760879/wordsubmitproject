package com.gupao.pattern.designmode.factory.factorymethod;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public class ComputerFactoryTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new LianXiangComputerFactory();
        computerFactory.createComputer().watchTelevision();
    }
}
