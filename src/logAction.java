import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Tests the working state of the entered API Key by sending a dummy web request and seeing if the server returns 200
 * If not, rejects the API key and prompts for another
 */
public class logAction extends AbstractAction{
    public static String key;

    /**
     * @param text The text the button has written on it
     * @param icon Icon the button should use, if any
     * @param desc Short description that pops up when hovered over
     * @param mnemonic Not sure
     */
    public logAction(String text, ImageIcon icon,
                     String desc, Integer mnemonic) {
        super(text, icon);
        putValue(SHORT_DESCRIPTION, desc);
        putValue(MNEMONIC_KEY, mnemonic);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.print(e.getSource().toString());
        try {
            key = Boot.keyField.getText();
            URL url = new URL("https://api.challonge.com/v1/tournaments.json?api_key=" + key);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            if (con.getResponseCode() != 200) {
                System.out.println(url.toString());
                JFrame er = new JFrame();
                er.add(new JLabel("Error " + con.getResponseCode() + ", please check your api key!"));
                er.pack();
                er.setVisible(true);
            }
            else {
                System.out.print("Success!");
                Boot.onKeyWorks();
            }

        }
        catch (MalformedURLException f) {
            f.printStackTrace();
        }
        catch (IOException f) {
            f.printStackTrace();
        }
    }

}
