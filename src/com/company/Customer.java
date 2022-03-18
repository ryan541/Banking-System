package com.company;

public class Customer {
    String firstName;
    String lastName;
    String phoneNumber;
    String idNumber;
    String dob;
    int age;

    public void setData(String firstName, String lastName, String phoneNumber, String idNumber, String dob, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.dob = dob;
        this.age = age;

    }

    public Customer() {
    }

    void getData() {
        System.out.println("First Name is : " + firstName);
        System.out.println("Your Last Name is : " + lastName);
        System.out.println("Your PhoneNumber is : " + phoneNumber);
        System.out.println("Your ID Number is : " + idNumber);
        System.out.println("Your Date Of Birth is : " + dob);
        System.out.println("Your Age is : " + age);

    }
   String getName(){
        return firstName+ " " +lastName;
   }

}
