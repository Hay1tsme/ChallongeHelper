import javax.swing.*;
import java.awt.event.ActionEvent;

import static javax.swing.SpringLayout.*;


public class editAction extends AbstractAction {



    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public editAction(String text, String desc, int height, int width) {
        super(text);
        putValue(SHORT_DESCRIPTION, desc);
        putValue(HEIGHT, height);
        putValue(WIDTH, width);

    }
}
