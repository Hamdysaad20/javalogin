import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;


public class Home extends JFrame {
    //create Jpanel with rounded corners

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
    private JPanel BROWS;
    private JLabel catigory;
    private JLabel playlist_name;
    private JLabel catigory2;
    private JLabel catigory3;
    private JLabel catigory4;
    private JLabel catigory5;
    private JLabel playlist_name2;
    private JLabel playlist_name3;
    private JLabel playlist_name4;
    private JLabel playlist_name5;


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
    public void changeIcon(JLabel label ,JLabel label2, String icon,String MusicName){
      //trim the name of the music to 20 char
        if(MusicName.length()>20){
            MusicName=MusicName.substring(0,20)+"...";
            label.setText(MusicName);
        }
        else{
            label.setText(MusicName);
        }

        label2.setIcon(new ImageIcon(icon));
    }

    // method that paly the music
    public void playMusic(String music){
        //get the path of the music
        String path = "./music/"+music;
        //create a new thread to play the music



    }

// create rounded jPanel with the given color

//create a method that change playlist_name and category
    public void changePlaylist(JLabel playlist_name,JLabel catigory,String playlist_nameSet,String catigory_name){
        playlist_name.setText(playlist_nameSet);
        catigory.setText(catigory_name);
    }

    //create a method that take astring and search for it in the database
    public static void searchFN(String search){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapp","root","1wd3wa2wsAa#");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM music WHERE musicTitle LIKE '%"+search+"%'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
            con.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args)   {

        //event when click on the search button


    Home frame = new Home();

        frame.Search_btn.addActionListener(e -> {
            String saerchString = frame.dfcsTextField.getText();

            searchFN(saerchString);
        });







      ImageIcon img = new ImageIcon("./image/music_art.png");
       frame.setIconImage(img.getImage());
        frame.changeIcon(frame.Card1_name,frame.card_btn1,"E://programingprojects//JavaProjects//javalogin//src//image//muic_artwork3.png","NOT SOBER - THE KID LAROI & Juice WRLD");
      frame.changeIcon(frame.Card2_name,frame.card_btn2,"E://programingprojects//JavaProjects//javalogin//src//image//muic_artwork2.png","NOT SOBER - THE KID LAROI & Juice WRLD");
        frame.changeIcon(frame.Card3_name,frame.card_btn3,"E://programingprojects//JavaProjects//javalogin//src//image//muic_artwork2.png","NOT SOBER - THE KID LAROI & Juice WRLD");
        frame.changeIcon(frame.Card4_name,frame.card_btn4,"E://programingprojects//JavaProjects//javalogin//src//image//muic_artwork2.png","NOT SOBER - THE KID LAROI & Juice WRLD");

        // sec (Mix playlist)
        frame.changePlaylist(frame.playlist_name,frame.catigory,"Mix","Playlist");
        frame.changePlaylist(frame.playlist_name2,frame.catigory2,"Mix","Playlist");
        frame.changePlaylist(frame.playlist_name3,frame.catigory3,"Mix","Playlist");
        frame.changePlaylist(frame.playlist_name4,frame.catigory4,"Mix","Playlist");
        frame.changePlaylist(frame.playlist_name5,frame.catigory5,"Mix","Playlist");

    }



}

