import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import javax.swing.tree.FixedHeightLayoutCache;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static javax.swing.SpringLayout.*;

public class createAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            URL url = new URL(urlBuild());
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("POST");
        }
        catch (MalformedURLException f) {
            f.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
    public createAction(String text,
                        String desc, int height, int width) {
        super(text);
        putValue(SHORT_DESCRIPTION, desc);
        putValue(HEIGHT, height);
        putValue(WIDTH, width);

    }
    private String urlBuild() {
        String base = "https://api.challonge.com/v1/tournaments.json";
        String key = values.key;
        String name;
        String sub;
        String type;
        String desc;
        boolean openSignups;
        return base + "?api_key=" + key + "&name=";

    }
}
