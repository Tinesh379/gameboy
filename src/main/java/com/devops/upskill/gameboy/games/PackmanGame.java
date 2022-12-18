package com.devops.upskill.gameboy.games;

public class PackmanGame implements GamingConsole{
    public void up(){
        System.out.println("fly high");
    }
    public void down(){
        System.out.println("swim");
    }
    public void left(){
        System.out.println("fire gun");
    }
    public void right(){
        System.out.println("throw grenades");
    }
}
