package com.gupao.pattern.designmode.factory.factorymethod;

import com.gupao.pattern.designmode.factory.Computer;
import com.gupao.pattern.designmode.factory.LianXiangComputer;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public class LianXiangComputerFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new LianXiangComputer();
    }
}
