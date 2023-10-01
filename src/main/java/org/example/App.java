package org.example;

import org.example.http.HttpImageStatusCli;

public class App {
    public static void main( String[] args ) {
        System.out.println("Enter HTTP status code");
        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        httpImageStatusCli.askStatus();
    }
}