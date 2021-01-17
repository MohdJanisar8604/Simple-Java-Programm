package com.company;

    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
         public class Main {
             public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd- HH:mm:ss.SSS");
        String formatted = current.format(formatter);
        System.out.println("Current Date and Time is: " + formatted );
       }
    }
