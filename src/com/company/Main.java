package com.company;
public class Main {

    public static void main(String[] args) {
    Laptop laptop = new Laptop();
    laptop.setName("Samsung");
    laptop.setPamyat(256);
    laptop.setColor("Kara");
    laptop.setProcessor("Intel Core i5");
        System.out.println(laptop.getName()+ " "+ laptop.getPamyat() +" "+ laptop.getColor() + " "+ laptop.getProcessor());
        laptop.tapshyrmaAtkarat();
        laptop.maalymatAlypBeret();
    }
}
