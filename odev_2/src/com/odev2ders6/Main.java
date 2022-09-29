package com.odev2ders6;

public class Main {
    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger()};
    for(BaseLogger logger: loggers){
        logger.log(logger+"---> log");

        System.out.println("-------------------");
    }


    CustomerManager customerManager = new CustomerManager(new FileLogger());
    customerManager.add();

    }
}
