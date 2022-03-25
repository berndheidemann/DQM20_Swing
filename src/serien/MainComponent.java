package serien;

import org.json.JSONObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainComponent {
    public JPanel getRootPanel() {
        return rootPanel;
    }

    private JPanel rootPanel;
    private JTextField textField1;
    private JButton anzeigenButton;
    private JLabel imageLabel;

    public MainComponent() {
        anzeigenButton.addActionListener(e -> click());
    }

    private void click() {

        try {
            URL url = new URL("https://api.tvmaze.com/singlesearch/shows?q=" + textField1.getText());

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        System.out.println(status);

        Scanner scan=new Scanner(con.getInputStream());
        String json=scan.nextLine();

        var doc=new JSONObject(json);

        String imgStr=doc.getString("image");
        var images=new JSONObject(imgStr);

        var medium=images.getString("large");
        System.out.println(medium);

        var image = ImageIO.read(new URL(medium));

        imageLabel.setIcon(new ImageIcon(image));
        } catch(Exception e) {
            e.printStackTrace();
            System.err.println(e.getCause());
        }

    }
}
