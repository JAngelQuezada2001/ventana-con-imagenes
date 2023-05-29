package programa_3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Interfaz extends JFrame implements ActionListener{
//    private FileNameExtensionFilter filter = new FileNameExtensionFilter(".jpg","png", "jpg");
    JButton button;
    JLabel label;
    JFileChooser fileChooser;
    
    public Interfaz(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,600);
        
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(100,100);
        label.setVisible(true);
//        label.setIcon(new ImageIcon(getClass().getResource("/imagenes/FsAyE3_XgAEhQTJ.jpg")));
//        label.setIcon(new ImageIcon(getClass().getResource("/imagenes/")));
//      ..\\imagenes\\FsAyE3_XgAEhQTJ.jpg

        
        button = new JButton();
        button.setText("Buscar imagen");
        button.setLayout(new GridBagLayout());
        button.setFocusable(false);
        button.addActionListener((ActionListener) this);
        button.setVisible(true);

        
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource()==button) {
            fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Buscar imagen...");
            fileChooser.setFileFilter(new FileNameExtensionFilter(".jpg", "jpg"));
            fileChooser.setFileFilter(new FileNameExtensionFilter(".png", "png"));
            fileChooser.setFileFilter(new FileNameExtensionFilter(".gif", "gif"));
            fileChooser.setCurrentDirectory(new File("/imagenes/"));
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                label.setIcon(new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath()));
            }
        }
    }
}
