import javax.swing.*;

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

     public static void paymentlogic(double TAX, float music_price, int Quantity){
     //tax= 2.5%
       double total_price=(music_price*Quantity)+((music_price*TAX)*Quantity);
         String[] res = new String[2];
         res[0]= String.valueOf(total_price);
         System.out.println(res[0]);
     }




    public static void main(String[] args)   {
        final double TAX= 14.5/100;
        float music_price = (float) 0.99;
        int Quantity=3;
        MainFrame frame = new MainFrame();
        System.out.println("all done");







     }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}











