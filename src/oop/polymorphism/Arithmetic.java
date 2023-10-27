package oop.polymorphism;

public class Arithmetic {
    public static Integer add(int a, int b){
        return a+b;
    }

    public static Integer add(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];
        }
        return sum;
    }
}
