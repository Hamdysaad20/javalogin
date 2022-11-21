import javax.swing.*;
import javax.swing.border.Border;


public class Home extends JFrame {
    private JPanel Container;
    private JPanel herder;
    private JPanel Player_Bar;
    private JPanel Controler;
    private JPanel Music_info;
    private JPanel music_art ;
    private JPanel text;
    private JPanel Info_Container;
    private JPanel Play_Pause;
    private JPanel Next_Song;
    private JPanel Back_song;
    private JPanel Buy_btn;
    private JButton buyNow099$Button;
    private JPanel header;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel User;
    private JPanel user_image;
    private JPanel user_info;
    private JPanel userHeader_img;
    private JPanel Search;
    private JTextField dfcsTextField;
    private JButton Search_btn;


    public  Home(){
        setContentPane(Container);
        setTitle("test");
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        Border emptyBorder = BorderFactory.createEmptyBorder();
        button1.setBorder(emptyBorder);
        button2.setBorder(emptyBorder);
        button3.setBorder(emptyBorder);
        Search_btn.setBorder(emptyBorder);



    }
    public static void main(String[] args)   {

        Home frame = new Home();
        System.out.println("all done");


    }


}
