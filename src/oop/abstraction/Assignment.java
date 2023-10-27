package oop.abstraction;

import java.io.IOException;
import java.util.Scanner;

public abstract class Assignment {
    public abstract <Stage> void  start(Stage stage) throws IOException;

    abstract class bank
    {
        public String BankName = "ExcelPLC";
        public String Branch = "Tayo";
        public void bankDetails()
        {
            System.out.println("Bank Name:" + BankName +" ");
        }
        abstract void deposit();
        abstract void withdrawal();
        abstract void checkBalance();
    }
    class bankService extends bank
    {
        private double money;
        private double bal = 10000;
        private int pwd;
        Scanner sc = new Scanner(System.in);
        public void bankDetails()
        {
            super.bankDetails();
            System.out.println("Branch:" + Branch);
        }
        void deposit()
        {
            System.out.println("Enter your pin:");
            pwd = (int) sc.nextDouble();
            if (pwd == 123)
            {
                System.out.println("Enter the amount of money");
                money = sc.nextDouble();
                bal = bal + money;
                System.out.println("Total Balance:" + bal);
                System.out.println("Deposited money:" + money);
            }
            else
            {
                System.out.println("Oga sure say na your pin be this?!");
            }
        }
        void withdrawal()
        {
            System.out.println("Enter your pin:");
            pwd = (int) sc.nextDouble();
            if (pwd == 123)
            {
                System.out.println("Enter the amount of money");
                money = sc.nextDouble();
                bal = bal = money;
                System.out.println("Total Balance:" + bal);
                System.out.println("Withdrawn money:" + money);
            }
            else
            {
                System.out.println("Oga sure say na your pin be this?!");
            }
        }
        void checkBalance()
        {
            System.out.println("Enter your pin:");
            pwd = sc.nextInt();
            if (pwd == 123)
            {
                System.out.println("Total Balance:" + bal);
            }
            else
            {
                System.out.println("Oga sure say na your pin be this?!");
            }
        }
    }
    class customers
    {
        public void main(String[] args)
        {
            bankService b = new bankService();
            b.bankDetails();
            int ch;
            char x;
            Scanner s = new Scanner(System.in);
            do
            {
                System.out.println("Deposit 1:");
                System.out.println("Withdrawal 2:");
                System.out.println("Check Balance 3:");
                System.out.println("Enter your choice sir:");
                ch = (int) 5.; s.nextInt();
                switch (ch)
                {
                    case 1: b.deposit();
                    break;
                    case 2: b.withdrawal();
                    break;
                    case 3: b.checkBalance();
                    break;
                    default: System.out.println("Oga you never choose anyone");
                }
                System.out.println("Continue? (y/n)");
                x = s.next() .charAt(0);
            }
            while (x == 'y');
        }
    }
}
