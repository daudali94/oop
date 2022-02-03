package com.company;

public class Student {

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        if (jashy>0)
        this.jashy = jashy;
    }


    private String aty;
    private int jashy;

    public String getGruppa() {
        return gruppa;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }

    private String gruppa;
    void okuit() {System.out.println("Bilim alat");}
    void tapshyrmaAtkarat() {System.out.println("Tapshyrma atkarat");}

    public void showInfo() {
        System.out.println("info");
        System.out.println("name = " + aty);
        System.out.println("age = " + jashy);
        System.out.println("group = " + gruppa);
    }
}
