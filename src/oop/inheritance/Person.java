package oop.inheritance;
public class Person {
    public String firstname;
    public String lastname;
    public Integer age;
    public Float weight;
    public Float height;
    public String complexion;
    public Person(String firstname, String lastname, String complexion, Integer age, Float height, Float weight){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public Person(){
        System.out.println("Hello world");
        System.out.println("This class has been created");
    }
    public String toString(){
        return "{ \n"+
                "   firstname = "  + this.firstname + "\n" +
                "   lastname = "  + this.lastname + "\n" +
                "   age = "  + this.age + "\n" +
                "   height = "  + this.height + "\n" +
                "   weight = "  + this.weight + "\n" +
                "   complexion = "  + this.complexion + "\n"+
        "}";
    }
}