package com.twu.biblioteca;

/**
 * Created by Lily on 2015/6/7.
 */
public class Login {
    public static void showWelcome() {
        System.out.println("Welcome to The Bangalore Public Library");
        System.out.println("********************************");
        System.out.println("1.Admin to login");
        System.out.println("2.Users to login");
        System.out.println("********************************");
        System.out.print("to login:");
    }

    public static boolean userLogin(String userNum,String userPwd){
        if(userNum.equals("000") && userPwd.equals("000")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean adminLogin(String adminNum,String adminPwd){
        if(adminNum.equals("admin") && adminPwd.equals("admin")){
            return true;
        }else {
            return false;
        }
    }
}
