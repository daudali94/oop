package com.company;
public class Main {

    public static void main(String[] args) {
//    Laptop laptop = new Laptop();
//    laptop.setName("Samsung");
//    laptop.setPamyat(256);
//    laptop.setColor("Kara");
//    laptop.setProcessor("Intel Core i5");
//        System.out.println(laptop.getName()+ " "+ laptop.getPamyat() +" "+ laptop.getColor() + " "+ laptop.getProcessor());
//        laptop.tapshyrmaAtkarat();
//        laptop.maalymatAlypBeret();
        Student student = new Student();
        student.setAty("Ali");
        System.out.println(student.getAty());
        student.setJashy(22);
        System.out.println(student.getJashy());
        student.setGruppa("Java 5");
        System.out.println(student.getGruppa());

        student.tapshyrmaAtkarat();
        student.okuit();
    }
}
