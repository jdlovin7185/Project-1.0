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
//                  make a smoother menu transition
                    break;

//                  user functionality
                case 2:
                    System.out.println("Welcome Back!!");
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do?");
                    System.out.println();
                    System.out.println("Option 1: Login");
                    System.out.println("Option 2: Update contact info");
                    System.out.println("Option 3: Delete Account");
                    menuSelection = menu.nextInt();

//                  ****************** user area ***************************
                    switch(menuSelection){

//                        login functionality
                        case 1:
                            break;

//                            update user info
                        case 2:
                            System.out.println("Lets update your contact info");
                            System.out.println("*******************************************");
                            System.out.println("Whats your first name?");
                            String updateFirstName = menu.next();
                            user.setFirstName(updateFirstName);
                            System.out.println("Whats your last name?");
                            String updateLastName = menu.next();
                            user.setLastName(updateLastName);
                            System.out.println("Change your birth year to?");
                            int updateBirthYear = menu.nextInt();
                            System.out.println("Whats your id?");
                            int updateUserId = menu.nextInt();
                            user.setId(updateUserId);
                            user.setBirthYear(updateBirthYear);
                            userDAO.updateUser(user);
                            break;

//                          delete a user
                        case 3:
                            System.out.println("Which user would you like to delete?");
                            System.out.println("Please provide an ID for your account");
                            int id = menu.nextInt();
                            userDAO.deleteUser(id);
                            System.out.println("Account has been deleted");
                            break;
                    }
                    break;

//                    breaks out of the while loop
                case 9:
                    flag = false;


            }
        }

    }
}