package com.mouse2java;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("success!!!");
        }catch (Exception e){
            System.out.println("error"+e);
        }
    }
}
