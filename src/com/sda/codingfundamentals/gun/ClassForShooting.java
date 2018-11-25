package com.sda.codingfundamentals.gun;

import java.util.Stack;

public class ClassForShooting {



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Gun makarov = new Gun(1111, "MAKAROV", stack);
        Gun makarov1 = new Gun(2222, "MAKAROV", stack);
        System.out.println(makarov.equals(makarov1));




//        Stack<Integer> magazine = makarov.getMagazine();
//        makarov.fillMagazine(magazine, 1);
//        makarov.fillMagazine(magazine, 2);
//        makarov.fillMagazine(magazine, 3);
//        makarov.fillMagazine(magazine, 4);
//        makarov.fillMagazine(magazine, 5);
//        makarov.fillMagazine(magazine, 6);
//        makarov.fillMagazine(magazine, 7);
//        makarov.fillMagazine(magazine, 8);
//
//        makarov.fillMagazine(magazine, 9);
//
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);
//        makarov.shoot(magazine);

    }
}
