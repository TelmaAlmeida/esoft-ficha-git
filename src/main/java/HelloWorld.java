import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;
    private JLabel lblMensagem2;

    public HelloWorld(){
        setContentPane(panel1);
        pack();
        lblMensagem2.setText("telma");
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}