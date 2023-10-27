package oop.Interface;

import java.util.Scanner;

public class View {

    private Account account;
    public View(){
        menu();
        Scanner scanner = new Scanner(System.in);
        var option = scanner.nextInt();

        switch (option){
            case 1 ->{
                System.out.println("Enter amount: ");
                var amount = scanner.nextDouble();
                account.deposit(amount);
                System.out.println("Deposited successfully!");
            }
        }
    }
    public void menu(){
        System.out.println("<<<<<<< SELECT TRANSACTION >>>>>>>");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("0. Exist");
    }
}
