package com.evilcorp;

public class SumArgs {

    private Integer i;
    private Integer j;

    public SumArgs() {
        this.i = 0;
        this.j = 0;

    }

    public SumArgs(Integer i, Integer j) {
        this.i = i;
        this.j = j;
    }

    public  Integer sumIJ(){
        return i+j;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Integer getJ() {
        return j;
    }

    public void setJ(Integer j) {
        this.j = j;
    }
}
