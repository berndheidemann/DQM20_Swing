package beispiel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://api.exchangerate.host/latest");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        System.out.println(status);

        Scanner scan=new Scanner(con.getInputStream());
        while(scan.hasNext()) {
            System.out.println(scan.nextLine()+"\n");
        }

    }
}
