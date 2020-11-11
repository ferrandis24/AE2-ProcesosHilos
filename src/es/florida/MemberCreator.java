package es.florida;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberCreator {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread thread = new Thread();
        Thread myThread = new Thread(thread);
        myThread.setName("MemberCreator");
        File file = new File("CorreosList.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);
        for (int i = 1; i < 5; i++) {
            printer.println("fran"+i+"@gmail.com");
            Thread.sleep(3000);
        }
        printer.close();
    }
}