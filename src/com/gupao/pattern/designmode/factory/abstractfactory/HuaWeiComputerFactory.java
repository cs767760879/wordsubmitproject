package com.gupao.pattern.designmode.factory.abstractfactory;

import com.gupao.pattern.designmode.factory.Charger;
import com.gupao.pattern.designmode.factory.Computer;
import com.gupao.pattern.designmode.factory.HuaWeiCharger;
import com.gupao.pattern.designmode.factory.HuaWeiComputer;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public class HuaWeiComputerFactory implements  ComputerFactory {
    @Override
    public Computer createComputer() {
        return new HuaWeiComputer();
    }

    @Override
    public Charger createCharger() {
        return new HuaWeiCharger();
    }
}
