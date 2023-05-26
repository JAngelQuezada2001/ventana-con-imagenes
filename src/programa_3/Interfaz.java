package tema_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Interfaz extends JFrame {
    JPanel panel = new JPanel();
    public Interfaz(){
    pack();
    setLocationRelativeTo(null);
    setMinimumSize(new Dimension(200,200));
    setSize(600, 600);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    componentePanel();
    }
    
    private void componentePanel(){
        this.getContentPane().add(panel);
        panel.setBackground(Color.red);
    }
}
