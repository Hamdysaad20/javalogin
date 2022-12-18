import javax.swing.*;

public class checkout extends JFrame{
    private JPanel main;
    private JPanel one;
    private JPanel two;
    private JPanel cover;
    private JPanel form;
    private JLabel image;
    private JTextField Name_on_card;
    private JTextField Card_number;
    private JTextField CVV;
    private JTextField expiry;
    private JTextField billing_adress;
    private JButton buy_now;
    private JPanel card;
    private JPanel data;
    private JPanel container;
    private JLabel Name_on_the_card;
    private JPanel header;
    private JPanel saved_data;
    private JTextField User_F_name;
    private JTextField User_L_name;
    private JPanel container_saved_data;
    private JPanel container_card;
    private JTextField City;
    private JTextField Country;


    public  checkout(){
        setContentPane(main);
        setTitle("Musicfy");
        setSize(1400,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args)   {

        checkout frame = new checkout();
        System.out.println("all done");







    }


}




