package com.company;

public class Student {
    public String getTuulganKyny() {
        return tuulganKyny;
    }

    public void setTuulganKyny(String tuulganKyny) {
        this.tuulganKyny = tuulganKyny;
    }

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getFamiliyasy() {
        return familiyasy;
    }

    public void setFamiliyasy(String familiyasy) {
        this.familiyasy = familiyasy;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        if (jashy>0)
        this.jashy = jashy;
    }

    private String tuulganKyny;
    private String aty;
    private String familiyasy;
    private int jashy;
}
