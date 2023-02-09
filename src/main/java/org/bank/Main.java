package org.bank;

import org.bank.User.User;
import org.bank.User.UserDAO;
import org.bank.User.UserDAOFactory;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User();
        UserDAO userDAO = UserDAOFactory.getUserDao();
        Scanner menu = new Scanner(System.in);
        boolean flag = true;
        int menuSelection = 0;
        while(flag){
            System.out.println("Welcome to Services");
            System.out.println("Home of Bank & Hotel Services");
            System.out.println("*******************************************");
            System.out.println("Please choose an option");
            System.out.println("*******************************************");
//            options 1 and 2 are being worked on
            System.out.println("Option 1: New User");
            System.out.println("Option 2: Existing User");

//            option 3 will be next
            System.out.println("Option 3: Hotel Reservation");
            System.out.println("Option 9: Exit");
            menuSelection = menu.nextInt();

//            option 1 - New User
            switch (menuSelection){
                case 1:
                    System.out.println("Welcome New User");
                    System.out.println("*******************************************");
                    System.out.println("Please enter your First name");
//                    insert exception for input mismatch

                    String firstName = menu.next();
                    user.setFirstName(firstName);

                    System.out.println("Please enter your Last name");
//                    insert exception for input mismatch
                    String lastName = menu.next();
                    user.setLastName(lastName);
//                    insert exception for input mismatch
                    System.out.println("Year of Birth");
                    int birthYear = menu.nextInt();
                    user.setBirthYear(birthYear);
                    userDAO.addUser(user);
                    System.out.println("Welcome " + firstName + " " + lastName);
                    System.out.println("*******************************************");
                    System.out.println("Please press 9 to return to the main menu");
                    int doNothing = menu.nextInt();
//make a smoother menu transition
                    break;

//                    update user
                case 2:
                    System.out.println("Welcome Back!!");
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do?");
                    System.out.println();
                    System.out.println("Option 1: Login");
                    System.out.println("Option 2: Update contact info");
                    break;
                case 2:

                    System.out.println("Please sign in");
                    System.out.println("Whats your first name?");
                    String loginFirstName = menu.next();
                    user.setFirstName(loginFirstName);
                    System.out.println("Year of Birth?");
                    int loginBirth = menu.nextInt();
                    user.setBirthYear(loginBirth);
                    userDAO.loginAccount(loginBirth);

                    break;

//                    breaks out of the while loop
                case 9:
                    flag = false;


            }
        }

    }
}