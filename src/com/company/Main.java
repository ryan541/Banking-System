package com.company;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

import static com.company.Accreditation.*;

public class Main extends Application {
    static Scanner input=new Scanner(System.in);
     static  Customer customer=new Customer();

    public static void main(String[] args) {
        launch(args);
        String member;
        System.out.println("Are you a Member?" + "\n" + "yes or no: ");
        member=input.next();
        if(member.compareTo("yes")==0 ){
         validatePassword();
             }else {


        System.out.println("Enter First Name: ");
        String fname = new Scanner(System.in).next();


        System.out.println("Enter Second Name: ");
        String lname = new Scanner(System.in).next();


        System.out.println("Enter Phone Number: ");
        String pnumber = new Scanner(System.in).next();


        System.out.println("Enter ID Number: ");
        String idnumb = new Scanner(System.in).next();


        System.out.println("Enter Date Of Birth: ");
        String birth = new Scanner(System.in).next();


        System.out.println("Enter Your Age: ");
        int agg = new Scanner(System.in).nextInt();

        customer.setData(fname,lname,pnumber,idnumb,birth,agg);

    }

       validatePassword();

    }


     static void validatePassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Password: ");
        String passWord = input.next();
        if (passWord.compareTo("0000") == 0) {
            selectChoice();
        } else {
            System.out.println("Password is incorrect!!!!Try Again");
        }

    }

     static void selectChoice() {
        System.out.println( "Choose Banking option: \n 1.Deposit \n 2.Withdraw Cash \n 3.Check Balance \n 4.Exit System ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                accountDeposit();
                break;
            case 2:
                accountWithdraw();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                exitSystem();
                break;
            default:
                System.out.println("Invalid Input!!!!!Log in!!");
                validatePassword();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource())
        Scene scene = new Scene(new VBox(),300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}



