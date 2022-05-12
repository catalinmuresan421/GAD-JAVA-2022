package com.company.lab4.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook("src/com/company/lab4/ch1/input.txt");
        System.out.println(pb.getContactByName("Chris"));
    }
}
