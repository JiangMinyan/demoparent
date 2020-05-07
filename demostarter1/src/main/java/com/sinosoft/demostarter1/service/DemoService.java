package com.sinosoft.demostarter1.service;

/**
 * @author jiangminyan
 * @create 2020-05-07 14:34
 **/
public class DemoService {

    public String sayWhat;

    public String toWho;

    public DemoService(String sayWhat, String toWho){
        this.sayWhat = sayWhat;
        this.toWho = toWho;
    }

    public String say(){
        return this.sayWhat + "! " + this.toWho;
    }

}
