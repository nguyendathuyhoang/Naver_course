package com.Likelion22.Homework_Week22.DesignPattern.SubClasses;

import com.Likelion22.Homework_Week22.DesignPattern.ComputerFactory.Computer;

public class Server extends Computer {

    @Override
    public String getType() {
        return "Server";
    }
}
