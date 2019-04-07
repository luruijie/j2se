package com.mouse2java;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        try {
            System.out.println("修改测试");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("success!!!");
        }catch (Exception e){
            System.out.println("error"+e);
        }
    }
}
