package com.gupao.pattern.designmode.factory.simplefactory;


import com.gupao.pattern.designmode.factory.HuaWeiComputer;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public class ComputerFactoryTest {
    public static void main(String[] args) {
//        ComputerFactory computerFactory = new ComputerFactory();
//        computerFactory.createComputer("huawei").watchTelevision();

//        ComputerFactory computerFactory = new ComputerFactory();
//        computerFactory.createComputer("com.gupao.pattern.designmode.factory.HuaWeiComputer").watchTelevision();

        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer(HuaWeiComputer.class).watchTelevision();
    }
}
