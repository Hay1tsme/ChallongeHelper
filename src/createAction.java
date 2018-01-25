import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class createAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        /*try {
            URL url = new URL(urlBuild());
        }
        catch (MalformedURLException f) {
            f.printStackTrace();
        }*/
        //HttpsURLConnection con =
    }
    public createAction(String text, ImageIcon icon,
                        String desc, Integer mnemonic) {
        super(text, icon);
        putValue(SHORT_DESCRIPTION, desc);
        putValue(MNEMONIC_KEY, mnemonic);
    }
    private String urlBuild() {
        String base = "https://api.challonge.com/v1/tournaments.json";
        String key = logAction.key;
        String name;
        String sub;
        String type;
        String desc;
        boolean open;
        return "";

    }
}
