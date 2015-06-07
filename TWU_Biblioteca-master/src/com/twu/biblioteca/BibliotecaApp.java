package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    static Login login = new Login();
    static Source source = new Source();
    public static void main(String[] args) {
        choose_login();
    }

    public static void choose_login(){
        login.showWelcome();
        Scanner aOru = new Scanner(System.in);
        int choice = aOru.nextInt();
        if (choice == 1){
            System.out.println("your admin number:");
            Scanner sc = new Scanner(System.in);
            String adminNum = sc.next();
            System.out.println("your admin password:");
            Scanner s = new Scanner(System.in);
            String adminPwd = sc.next();
            if ( login.adminLogin(adminNum,adminPwd) == true){
                adminTable();
            }else {
                System.out.println("your number or password is not correct!");
            }
        }else if (choice == 2){
            System.out.println("your user number:");
            Scanner sc = new Scanner(System.in);
            String userNum = sc.next();
            System.out.println("your user password:");
            Scanner s = new Scanner(System.in);
            String userPwd = sc.next();
            if ( login.userLogin(userNum,userPwd) == true){
                userTable();
            }else {
                System.out.println("your number or password is not correct!");
            }
        }
    }

    public static void adminTable(){
        System.out.println("adminTable");
    }

    public static void userTable(){
        source.userFrame();
        Scanner aOru = new Scanner(System.in);
        int choice = aOru.nextInt();
        source.operations(choice);
    }
}
