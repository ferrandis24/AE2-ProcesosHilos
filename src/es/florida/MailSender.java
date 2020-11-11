package es.florida;

import java.io.*;

public class MailSender {

    public static void main(String[] args ) throws IOException, InterruptedException {
        String file = "CorreosList.txt";
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        while ((line = bReader.readLine()) != null) {
            System.out.println("hola quetal, "+line+"!");
            Thread.sleep(5000);
        }
    }
}