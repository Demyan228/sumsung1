package com.company;

public class Fraction {
    int num;
    int denum;

    public Fraction(){
        this.num = 1;
        this.denum = 1;
    }

    public Fraction(int num, int denum){
        this.num = num;
        this.denum = denum;
    }

    public void multyOnKoef(int k){
        num *= k;
        if (k != 0) denum *= k;
    }

    public Fraction multyOnfraction(Fraction fraction2){
        Fraction res = new Fraction(num * fraction2.num,
                denum * fraction2.denum);
        return res;
    }

    public Fraction divideOnfraction(Fraction fraction2){
        Fraction res = new Fraction(num * fraction2.denum,
                denum * fraction2.num);
        return res;
    }

    public Fraction addfraction(Fraction fraction2){
        int num3 = num * fraction2.denum + denum * fraction2.num;
        int denum3 = denum * fraction2.denum;
        Fraction res = new Fraction(num3, denum3);
        return res;
    }

    public Fraction subtractfraction(Fraction fraction2){
        int num3 = num * fraction2.denum - denum * fraction2.num;
        int denum3 = denum * fraction2.denum;
        Fraction res = new Fraction(num3, denum3);
        return res;
    }

    @Override
    public String toString() {
        return num + " / " + denum;
    }
}