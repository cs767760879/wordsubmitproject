package com.gupao.pattern.designmode.factory.simplefactory;

import com.gupao.pattern.designmode.factory.Computer;

/**
 * @Author Vera
 * @Date 2019/5/13
 **/
public class ComputerFactory {
    //    public Computer createComputer(String name){
//        if("lianxiang".equals(name)){
//            return new LianXiangComputer();
//        }else if("huawei".equals(name)){
//            return new HuaWeiComputer();
//        }else{
//            return null;
//        }
//    }
//    public Computer createComputer(String className) {
//        try {
//            if (!"".equals(className)) {
//                Class<?> clazz = Class.forName(className);
//                return (Computer) clazz.newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//             return null;
//    }
    public Computer createComputer(Class<?> clazz) {
        if (clazz != null) {
            try {
                return (Computer)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
