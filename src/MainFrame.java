import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainFrame  extends JFrame{
    private JLabel usernamelab;
    private JTextField username_input;
    private JLabel password;
    private JButton loginButton;
    private JButton donTHaveAccountButton;
    private JPasswordField pass_input;
    private  JPanel mainPanal;
    private JPanel container;
    private JPanel all;
    private JPanel front_image;


    public  MainFrame(){
        setContentPane(mainPanal);
setTitle("Musicfy");
setSize(800,800);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);











    }

//method to validate the password is at least 8 characters long and contains at least one digit and one special character
    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }



    public static void main(String[] args)   {

        MainFrame frame = new MainFrame();
        System.out.println("from the main in the main frame");
        //on click of donTHaveAccountButton open the register frame
        frame.donTHaveAccountButton.addActionListener(e -> {
            System.out.println("from the main in the main frame");
            signUp frame2 = new signUp();
            frame2.setVisible(true);
            frame.setVisible(false);
        });
        frame.loginButton.addActionListener(e -> {
           //validate the password
            if (validatePassword(frame.pass_input.getText())) {

                JOptionPane.showMessageDialog(null, "Password is valid");

                signUp registerFrame = new signUp();
                registerFrame.setVisible(true);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "password is not valid");
            }

        });






     }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}











