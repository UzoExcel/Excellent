package oop.polymorphism;

public class Patient extends Person{
    private Long cardNumber;

    public Patient(String firstName, String lastName, Long cardNumber) {
        super(firstName, lastName);
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "cardNumber=" + cardNumber +
                '}';
    }
}
