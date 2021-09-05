package com.mosbach.utils;

public class ClassPrep {

    public ClassPrep () {
    }

    public int addTwoNumbers(int a, int b) {
        return
                a+b;
    }

    public static void main(String[] args) {

        ClassPrep classPrep = new ClassPrep();
        System.out.println("Thank God, I can add the numbers 5 and 7.");
        System.out.println("They add up to " + classPrep.addTwoNumbers(5, 7));
    }

}
