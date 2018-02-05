import java.awt.*;
import javax.swing.*;

public class Boot implements Runnable {
    public static JTextField keyField;
    public static JFrame f;
    public static JButton logButton;
    public static JLabel label1;
    @Override
    public void run() {
        // Create the window
        f = new JFrame("Challonge Helper");
        // Sets the behavior for when the window is closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Set min window size
        f.setSize(400,120);
        // Add a layout manager so that the button is not placed on top of the label
        f.setLayout(new FlowLayout());

        //Create a text field, Action, and Button
        keyField = new JTextField("",30);
        Action logAct = new logAction("Log In", "Log in with your Challonge API key", 10, 30);
        logButton = new JButton(logAct);
        label1 = new JLabel("API Key: ");

        //Add a label, and the button and text field to the frame
        f.getContentPane().add(label1);
        f.getContentPane().add(keyField);
        f.getContentPane().add(logButton);


        // Arrange the components inside the window
        //f.pack();
        // By default, the window is not visible. Make it visible.
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Boot se = new Boot();
        // Schedules the application to be run at the correct time in the event queue.
        SwingUtilities.invokeLater(se);
    }

    public static void onKeyWorks() {
        logButton.setVisible(false);
        keyField.setVisible(false);
        label1.setText("API Key: " + values.key);

        Action edtAct = new editAction("Edit", "Edit an already existing tournament", 10, 30);
        Action btnCreAct = new createBtnAction("Create", "Create a tournament", 10, 30);
        JButton btnCreate = new JButton(btnCreAct);
        JButton btnEdit = new JButton(edtAct);

        f.getContentPane().add(btnCreate);
        f.getContentPane().add(btnEdit);
    }


}