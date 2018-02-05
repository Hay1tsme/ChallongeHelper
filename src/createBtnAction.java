import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.SpringLayout.HEIGHT;
import static javax.swing.SpringLayout.WIDTH;


public class createBtnAction extends AbstractAction {

    //Put these here so the createAction class can acess the text from them
    //I hate that I have to do this because it's jank and cluttered as hell but it works and I don't feel like breaking it 20 more times to find a better way.
    public static JTextField jtfName;
    public static JTextField jtfSub;
    public static JTextArea jtaDesc;
    public static JComboBox jcbType;
    public static JCheckBox jckOpen;

    public void actionPerformed(ActionEvent e) {
        JFrame f = new JFrame("Challonge Helper: Create Tournament");

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        jtfName = new JTextField("Tournament Name", 60);
        jtfSub = new JTextField("Tournament Subdomain (optional)", 60);

        jtaDesc = new JTextArea("Tournament Description (optional)");

        jckOpen = new JCheckBox("Allow Open Sign-ups?");

        jcbType = new JComboBox(values.types);
        jcbType.setSelectedIndex(0);

        Action creAct = new createAction("Create", "Creates the tournament with the specified paramaters", 10, 30);
        JButton jbtCreate = new JButton(creAct);

        f.getContentPane().add(jtfName);
        f.getContentPane().add(jtfSub);
        f.getContentPane().add(jtaDesc);
        f.getContentPane().add(jckOpen);
        f.getContentPane().add(jcbType);
        f.getContentPane().add(jbtCreate);
    }
    public createBtnAction(String text,
                           String desc, int height, int width) {
        super(text);
        putValue(SHORT_DESCRIPTION, desc);
        putValue(HEIGHT, height);
        putValue(WIDTH, width);
    }
}
