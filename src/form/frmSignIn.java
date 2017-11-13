package form;

/**
 * Created by Bac on 11/13/2017.
 */
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.Event.*;
public class frmSignIn {
    // todo display
    JFrame main;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnSignIn;
    public frmSignIn(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width =  screenSize.getWidth();
        double height = screenSize.getHeight();
        //todo Jframe
        main = new JFrame(  "Sign in"); // Khung
        main.setBounds((int)width/2-170,(int)height/2-250,500,350);
        main.setResizable(false);
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labelMain = new JLabel("Student Management");
        labelMain.setFont(new Font("Courier New",Font.BOLD,25));
        labelMain.setBounds(130,20,400,50);
        main.add(labelMain);
        //todo JPanel
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(""));
        panel.setBounds(130,80,250,90);
        panel.setLayout(null);
        //todo Label of User and Passw
        JLabel labelUser = new JLabel("User: ");
        labelUser.setBounds(10,10,150,20);
        JLabel labelPass = new JLabel("Password:");
        labelPass.setBounds(10,40,150,20);
        panel.add(labelUser);
        panel.add(labelPass);
        //todo input Keybord
        txtUser = new JTextField();
        txtUser.setBounds(90,10,130,25);
        txtPass = new JPasswordField();
        txtPass.setBounds(90,40,130,25);
        panel.add(txtUser);
        panel.add(txtPass);
        //todo Button
        JButton btnSignIn = new JButton("Sign In");
        btnSignIn.setBounds(130, 210, 100,40);
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(280, 210, 100,40);
        main.add(btnExit);
        main.add(btnSignIn);
        main.add(panel);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frmSignIn frame = new frmSignIn();
            }
        });
    }
}
