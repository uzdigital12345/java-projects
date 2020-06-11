package com.company;

public class SuperClass {

    Logger logger;

    public SuperClass(Logger logger){
        this.logger=logger;
    }

    public void doWork(){
        logger.Log("Hello");
        logger.Log("1");
        logger.Log("3");
        logger.Log("2");
        logger.Log("5");
    }
}
