package com.company;

import java.util.Scanner;

import static com.company.Main.customer;

public class Accreditation {
    static int accountDeposit() {
        Scanner myInput = new Scanner(System.in);
        int deposit,newBalance;
        int amount = 1000;
        double transactionFee;

        System.out.println("Enter amount to deposit: ");
        deposit = myInput.nextInt();
        transactionFee = (deposit * 0.01) / 100;
        newBalance = (int) ((amount + deposit) - transactionFee);

        System.out.println("Name is: " + customer.getName());
        System.out.println("Amount deposited is: " + deposit);
        System.out.println("Balance before deposit is: " + amount);
        System.out.println("Transaction fee: " + transactionFee);
        System.out.println("New balance is: " + newBalance);
        return newBalance;
    }

    static void  accountWithdraw() {
        int withdraw;
        double amount=1000.0;
        double balance;
        double transactionFee;
        System.out.println("Enter Amount to Withdraw: ");
        Scanner input = new Scanner(System.in);
        withdraw = input.nextInt();
        transactionFee = ((withdraw * 0.01) / 100);
        balance = (amount - withdraw)-transactionFee;
        if(amount > withdraw && balance >= 500) {
            System.out.println("Your new balance is : " + balance);

        }else {
            System.out.println("Withdrawal cannot be completed!!!");
        }
        System.out.println("Name is: " + customer.getName());
        System.out.println("Amount before withdrawal is: " + amount);
        System.out.println("Amount Withdrawn is : " + withdraw);
        System.out.println("Transaction fee: " + transactionFee);
        System.out.println("New balance is: " + balance);

        System.exit(202);
    }

    static void checkBalance(){
        int amount=1000;
        System.out.println("Name is: " + customer.getName());
        System.out.println("Your Current Balance is : " + amount);
        System.exit(303);
    }

    static void exitSystem(){

        System.exit(404);
    }
}
