import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


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
    private JPanel navigators_panel;
    private JButton Home;
    private JButton Liked;
    private JPanel Sec1;
    private  JLabel Card1_name;
    private JPanel search_res;
    private JPanel search_area;
    private JPanel search_block;
    private JLabel card_btn;
    private JLabel card_btn2;
    private JLabel card_btn3;
    private JLabel Card2_name;
    private JLabel Card3_name;
    private JLabel Card4_name;
    private JPanel sec2;
    private JLabel card_btn4;
    private JPanel card2;
    private JPanel card2_info;
    private JPanel card1;
    private JPanel card3;
    private JPanel card4;
    private JLabel card_btn1;


    public  Home(){
        setContentPane(Container);
        setTitle("Musicfy");
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Image icon =Toolkit.getDefaultToolkit().getImage("./image/ico.png");
        setIconImage(icon);


        Border emptyBorder = BorderFactory.createEmptyBorder();
        button1.setBorder(emptyBorder);
        button2.setBorder(emptyBorder);
        button3.setBorder(emptyBorder);
        Search_btn.setBorder(emptyBorder);
        Home.setBorder(emptyBorder);
        Liked.setBorder(emptyBorder);

    }

    // method that change the icon of the label and the text of the label
//    public void changeIcon(JLabel label ,JLabel label2, String icon,String MusicName){
//        label2.setIcon(new ImageIcon(icon));
//        label.setText(MusicName);
//    }


    public static void main(String[] args)   {

        Home frame = new Home();
        ImageIcon img = new ImageIcon("./image/music_art.png");
        frame.setIconImage(img.getImage());

//        frame.changeIcon(frame.Card2_name,frame.card_btn2,"E://programingprojects//JavaProjects//javalogin//src//image//muic_artwork3.png","Music Name");
    }



}
