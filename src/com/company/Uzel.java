package com.company;

public class Uzel {
   private int hodnota;
   private Uzel Front;
   private Uzel Last;

    public Uzel(Integer hodnota) {
        this.hodnota = hodnota;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }

    public Uzel getFront() {
        return Front;
    }

    public void setFront(Uzel front) {
        Front = front;
    }

    public Uzel getLast() {
        return Last;
    }

    public void setLast(Uzel last) {
        this.Last = last;
    }
}
