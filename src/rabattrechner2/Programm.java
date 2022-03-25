package rabattrechner2;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programm {

    public static void main(String[] args) throws IOException, JSONException {
       // MyFrame frame=new MyFrame();

        URL url = new URL("https://api.tvmaze.com/singlesearch/shows?q=girls");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        System.out.println(status);

        Scanner scan=new Scanner(con.getInputStream());
        String json=scan.nextLine();

        var doc=new JSONObject(json);

        String imgStr=doc.getString("image");
        var images=new JSONObject(imgStr);

        var medium=images.getString("medium");
        System.out.println(medium);












    }
}
