package com.sda.codingfundamentals.gun;

import java.util.Objects;
import java.util.Stack;

public class Gun {

    private int serialNumber;
    private String name;
    private Stack<Integer> magazine;

    public Gun(String name, Stack<Integer> magazine) {
        this.name = name;
        this.magazine = magazine;
    }

    public Gun(int serialNumber, String name, Stack<Integer> magazine) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.magazine = magazine;
    }

    public Stack<Integer> fillMagazine(Stack<Integer> magazine, int bulletNumber) {
        if (magazine.size() < 8) {
            magazine.push(bulletNumber);
            System.out.println("+1 bullet filled in " + name);
        } else {
            System.out.println("Sorry but " + name + "'s magazine is full");
        }
        return magazine;
    }

    public Stack<Integer> shoot(Stack<Integer> magazine) {
        if (!magazine.isEmpty()) {
            magazine.pop();
            System.out.println("Shooted from " + name);
        } else {
            System.out.println(name + "'s magazine is empty!");
        }
        return magazine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Integer> getMagazine() {
        return magazine;
    }

    public void setMagazine(Stack<Integer> magazine) {
        this.magazine = magazine;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gun gun = (Gun) o;
        return serialNumber == gun.serialNumber &&
                Objects.equals(name, gun.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, name);
    }
}
