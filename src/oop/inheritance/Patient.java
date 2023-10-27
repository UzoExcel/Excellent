package oop.inheritance;
public class Patient extends Person{
    public Patient(String firstname, String lastname, String complexion, Integer age, Float height, Float weight){
        super(firstname, lastname, complexion, age, height, weight);
    }
    public static void main(String[] args){
        Patient prince = new Patient("james","davidson","dark", 22, 7.1F, 6.5F);
        System.out.println(prince);
    }
}