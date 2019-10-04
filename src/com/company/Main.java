package com.company;

public class Main {

    public static void main(String[] args) {
        Uzel main = intiSeznam(5);

    }

    public static Uzel intiSeznam(int delkaseznamu) {
        Uzel prvniUzel = new Uzel(1);
        Uzel temp = prvniUzel;
        for (int i = 2; i <= delkaseznamu; i++) {
            Uzel newUzel = new Uzel(i);
            newUzel.setFront(temp);



            prvniUzel.setFront(newUzel);
        }
        return prvniUzel;
    }

}




