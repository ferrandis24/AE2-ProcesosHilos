package es.florida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String classpath = "./out/production/AE2-ProcesosHilos/";
	 ProcessBuilder builderCreator = new ProcessBuilder("java", "-cp", classpath, "es.florida.MemberCreator");
	 Process processCreator = builderCreator.start();
	 processCreator.getInputStream();
	 InputStreamReader isrCreator = new InputStreamReader(processCreator.getInputStream());

	 ProcessBuilder builderMonitor = new ProcessBuilder("java", "-cp", classpath, "es.florida.MemberMonitor");
	 Process processMonitor = builderMonitor.start();
	 processMonitor.getInputStream();
	 InputStreamReader isrMonitor = new InputStreamReader(processMonitor.getInputStream());

	 ProcessBuilder builderSender = new ProcessBuilder("java", "-cp", classpath, "es.florida.MailSender");
	 Process processSender = builderSender.start();
	 processSender.getInputStream();
	 InputStreamReader isrSender = new InputStreamReader(processSender.getInputStream());
	 BufferedReader readerSender = new BufferedReader(isrSender);
	 String lineSender;
	 while ((lineSender = readerSender.readLine()) != null) {
	     System.out.println(lineSender);
	 }
    }
}
