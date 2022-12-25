import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
                //check if the username and password are correct from the database
                //if correct open the home page
                //else show error message
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapp","root","1wd3wa2wsAa#");
                    Statement stmt = con.createStatement();
                    String sql = "SELECT * FROM userinfo WHERE userName = '"+frame.username_input.getText()+"' AND userPassword = '"+frame.pass_input.getText()+"'";
                    System.out.println(sql);
                    stmt.executeQuery(sql);
                    System.out.println("from the main in the main frame");
                   //if the username and password are correct open the home page

                    Home frame3 = new Home();
                    frame3.setVisible(true);
                    frame.setVisible(false);




                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            } else {
                JOptionPane.showMessageDialog(null, "password is not valid");
            }

        });






     }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}











