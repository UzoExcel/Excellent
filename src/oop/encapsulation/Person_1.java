package oop.encapsulation;
import oop.inheritance.Person;
public class Person_1 {
    private String firstname;
    private String lastname;
    private Integer age;
    private Float weight;
    private Float height;
    private String complexion;
    public static void main (String[] args){
        Person Person_1 = new Person();
        Person_1.firstname = "Excellent";
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public Float getHeight() {
        return height;
    }
    public void setHeight(Float height) {
        this.height = height;
    }
    public String getComplexion() {
        return complexion;
    }
    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getfirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public Person_1(String firstname, String lastname, Integer age, Float weight, Float height, String complexion) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.complexion = complexion;
    }
    public String toString() {
        return "Person{"+
                "firstname='" + firstname + '\n' +
                "lastname='" + lastname + '\n' +
                "age='" + age + '\n' +
                "weight='" + weight + '\n' +
                "height='" + height + '\n' +
                "complexion='" + complexion + '\n' +
                '}';
    }
}