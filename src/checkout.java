import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkout extends JFrame{
    private JPanel main;
    private JPanel one;
    private JPanel two;
    private JPanel cover;
    private JPanel form;
    private JLabel image;
    private  JTextField Name_on_card;
    private JTextField Card_number;
    private JTextField CVV;
    private  JTextField expiry;
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
    private JPanel user_detailes;
    private JPanel buttons;
    private JPanel Error_Area;
    private  JLabel Error_message;
    private JButton cansel_btn;
    private JLabel totalprice_name;
    private JPanel price_area;
    private JPanel quantity_area;
    private JLabel quantity_name;
    private JLabel price;
    private JLabel quantity;


    public  checkout(){
        setContentPane(main);
        setTitle("Musicfy");
        setSize(1400,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }




    public static void Textfield_NumberOnly(JTextField textField){
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= '0') && (c <= '9')  ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE))) {

                    evt.consume();
                }
            }
        });
    }


//Textfield_NumberOnlyExpire takes the textfield and make it only accept numbers at date format (MM/YY)
    public static void Textfield_NumberOnlyExpire(JTextField textField){
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            // max numbers allowed in the textfield is 4
            int max=5;
            //chek if the textfield is formated as MM/YY
            boolean check=false;

            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= '0') && (c <= '9')  ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE))) {

                    evt.consume();
                }
                if (textField.getText().length() >= max) {
                    evt.consume();
                }
                if (textField.getText().length() == 2) {
                    textField.setText(textField.getText() + "/");
                    check=true;
                }
                if (textField.getText().length() == 5 && check==true) {
                    evt.consume();
                }
            }

            //on backspace delete the textfield
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    textField.setText("");
                    check=false;
                }
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (textField.getText().length() == 2) {
                    textField.setText(textField.getText() + "/");
                    check=true;
                }
                if (textField.getText().length() == 5) {
                    check=false;
                }
                if (textField.getText().length() == 2 && check==false) {
                    textField.setText(textField.getText().substring(0, 1));
                }
            }

    });


    }



    // crideit card number validation (16 numbers)
    public static void Textfield_NumberOnlyCard(JTextField textField){
        // check the format of the card number (4-4-4-4)
        final boolean[] check = {false};
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            int max=19;
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= '0') && (c <= '9')  ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE))) {

                    evt.consume();
                }
                if (textField.getText().length() >= max) {
                    evt.consume();
                }
                if (textField.getText().length() == 4) {
                    textField.setText(textField.getText() + "-");
                    check[0] =true;
                }
                if (textField.getText().length() == 9 && check[0] ==true) {
                    textField.setText(textField.getText() + "-");
                    check[0] =false;
                }
                if (textField.getText().length() == 14 && check[0] ==false) {
                    textField.setText(textField.getText() + "-");
                    check[0] =true;
                }
                if (textField.getText().length() == 19 && check[0] ==true) {
                    evt.consume();
                }
            }

            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    textField.setText("");
                    check[0] =false;
                }
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (textField.getText().length() == 4) {
                    textField.setText(textField.getText() + "-");
                    check[0] =true;
                }
                if (textField.getText().length() == 9 && check[0] ==true) {
                    textField.setText(textField.getText() + "-");
                    check[0] =false;
                }
                if (textField.getText().length() == 14 && check[0] ==false) {
                    textField.setText(textField.getText() + "-");
                    check[0] =true;
                }
                if (textField.getText().length() == 19 && check[0] ==true) {
                    check[0] =false;
                }
                if (textField.getText().length() == 4 && check[0] ==false) {
                    textField.setText(textField.getText().substring(0, 3));
                }
                if (textField.getText().length() == 9 && check[0] ==false) {
                    textField.setText(textField.getText().substring(0, 8));
                }
                if (textField.getText().length() == 14 && check[0] ==true) {
                    textField.setText(textField.getText().substring(0, 13));
                }
            }

        });

    }







    // Name_on_card validation (only letters) and max 40 letters allowed WITH SPACE
    public static void Textfield_LetterOnlyName(JTextField textField){
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            int max=40;
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE) ||
                        (c == java.awt.event.KeyEvent.VK_SPACE))) {

                    evt.consume();
                }
                if (textField.getText().length() >= max) {
                    evt.consume();
                }
            }
        });
    }
    public static void Textfield_BillingAdress(JTextField textField){
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            int max=50;
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= 'a') && (c <= 'z')  || (c >= 'A') && (c <= 'Z') ||((c >= '0') && (c <= '9')) ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE) ||
                        (c == java.awt.event.KeyEvent.VK_SPACE))) {

                    evt.consume();
                }
                if (textField.getText().length() >= max) {
                    evt.consume();
                }
            }
        });
    }








// here the textfield CVV accept numbers max 3 numbers
    public static void CVV(JTextField textField){
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            int max=3;
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= '0') && (c <= '9')  ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE))) {

                    evt.consume();
                }
                if (textField.getText().length() >= max) {
                    evt.consume();
                }
            }
        });
    }


    // if error_message is true then add the error message to the label and show the error message panel
    public static void Error_Message(JPanel panel,JLabel label,String error_message,boolean error){
        if(error){
            panel.setVisible(true);
            label.setText(error_message);

        }else{
            panel.setVisible(false);

        }
    }

// button onclick event to go to the next page

    public static void Button_Next(JButton cansel_btn,JPanel form ,JPanel next_form ){
        cansel_btn.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                form.setVisible(false);
                form.setVisible(true);

            }



        });



    }
//method to change the quantity label when the quantity is changed
    public static int Change_Quantity(JLabel label,int quantity){
        label.setText(String.valueOf(quantity));
        return quantity;
    }

    //method tho change the quantity and price of the product
    public static void Change_Price(double quantity,JLabel price,Double price_product){

                if(quantity == 0){
                    price.setText("0.00");
                }else{
                    price.setText(String.valueOf(price_product*((int) quantity)));
                }
            }



    public static void main(String[] args)   {

        try {
            checkout frame = new checkout();
            System.out.println("all done");

            Textfield_NumberOnly(frame.Card_number);
            CVV(frame.CVV);
            Textfield_NumberOnlyExpire(frame.expiry);
            Textfield_NumberOnlyCard(frame.Card_number);
            Textfield_LetterOnlyName(frame.Name_on_card);
            Textfield_BillingAdress(frame.billing_adress);
            Error_Message(frame.Error_Area,frame.Error_message,"THEIS IS AN ERROR MESSAGE",true);

           //change the quantity to change the price .
            int quantityValPassed = Change_Quantity(frame.quantity,12);
            Change_Price(quantityValPassed,frame.price,1.99);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}




