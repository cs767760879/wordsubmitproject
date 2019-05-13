package com.gupao.pattern.designmode.factory.abstractfactory;

import com.gupao.pattern.designmode.factory.Charger;
import com.gupao.pattern.designmode.factory.Computer;
import com.gupao.pattern.designmode.factory.LianXiangCharger;
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

    @Override
    public Charger createCharger() {
        return new LianXiangCharger();
    }
}
