package com.gupao.pattern.designmode.factory.abstractfactory;

import com.gupao.pattern.designmode.factory.Charger;
import com.gupao.pattern.designmode.factory.Computer;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public interface ComputerFactory {
    Computer createComputer();

    Charger createCharger();

}
