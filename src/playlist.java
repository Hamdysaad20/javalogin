import javax.swing.*;
import java.awt.*;

public class playlist extends  JFrame {
    private JPanel Info_Container;
    private JPanel text;
    private JPanel music_art;
    private JLabel playlist_name;

    public playlist(){
        setContentPane(Info_Container);
        setTitle("Musicfy");
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Image icon =Toolkit.getDefaultToolkit().getImage("./image/ico.png");
        setIconImage(icon);

    }

    public static void main(String[] args) {
           new playlist();


    }
}
