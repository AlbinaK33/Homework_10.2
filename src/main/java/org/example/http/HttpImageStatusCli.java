package org.example.http;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {

    private static final Scanner scanner = new Scanner(System.in);

    public void askStatus() {
        String statusCode = scanner.nextLine();

        try {
            new HttpStatusImageDownloader().downloadStatusImage(Integer.parseInt(statusCode));
            System.out.println("Image downloaded successfully!");
        } catch (IOException e) {
            System.out.println("There is no image for HTTP status " + statusCode);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            askStatus();
        }
    }
}
