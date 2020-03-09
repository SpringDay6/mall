package com.y2game.mall.controller;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int j = 0;
        for(int i = 0;i<10;i++){
            j = random.nextInt(2);
            System.out.println("第"+i+"次打印:"+j);
        }
    }
}
