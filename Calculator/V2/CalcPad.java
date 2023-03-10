import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class CalcPad extends JButton {
    CalcPad(String text,int width,int height){
        this.setText(text);
        this.setPreferredSize(new Dimension(width,height));
        this.setFocusable(false); 
        this.setFont(new Font("Calibri",Font.PLAIN,25));
    }
    CalcPad(String text,int width,int height,int color) {
        this.setText(text);
        this.setPreferredSize(new Dimension(width,height));
        this.setFocusable(false); 
        this.setFont(new Font("Helvetica",Font.BOLD,25));
        this.setForeground(new Color (color));
    }
    
}
