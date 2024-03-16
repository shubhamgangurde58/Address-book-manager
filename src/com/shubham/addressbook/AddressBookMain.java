package com.shubham.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    Scanner scanner = new Scanner(System.in);
    Contacts contacts = new Contacts();
    public void createContact(){
        System.out.println("Enter the first name=");
        contacts.setfName(scanner.next());
        System.out.println("Enter the last name=");
        contacts.setlName(scanner.next());
        System.out.println("Enter the Address=");
        contacts.setAddress(scanner.next());
        System.out.println("Enter the State=");
        contacts.setState(scanner.next());
        System.out.println("Enter the city=");
        contacts.setCity(scanner.next());
        System.out.println("Enter the Zipcode=");
        contacts.setZip(scanner.next());
        System.out.println("Enter the phone name");
        contacts.setPhoneNo(scanner.next());
        System.out.println("Enter the email=");
        contacts.setEmail(scanner.next());;

    }
    public void displayContact(){
        System.out.println(contacts.toString());
    }
    public static void main(String[] args){
        System.out.println("Welcome To Address Book manager");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.createContact();
        addressBookMain.displayContact();
    }
}

