import javax.swing.*;
import java.awt.*;

public class AccountField {

    private JLabel label;
    private JTextField field;
    JComboBox<String> comboBox;
    JSpinner spinner;

    public AccountField(String title,int xlabel,int ylabel,int xfield,int yfield,int wlabel,int hlabel,int wfield,int hfield){
            label = new JLabel(title);
            label.setBounds(xlabel,ylabel,wlabel,hlabel);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Helvetica",Font.PLAIN,15));

            field = new JTextField();
            field.setBounds(xfield,yfield,wfield,hfield);
            field.setCaretColor(Color.BLACK); 
            field.setEditable(true);
    }
    
    public AccountField(String title,int ylabel,int ybox,String[] options) {
        label = new JLabel(title);
        label.setBounds(40,ylabel,100,100);
        label.setForeground(Color.WHITE);

        comboBox = new JComboBox<>(options);
        comboBox.setBounds(120,ybox,305,20);
    }
    public AccountField(String title,int min,int max,int step){
            label = new JLabel(title);
            label.setBounds(40,40,100,100);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Helvetica",Font.PLAIN,15));

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, min, max, step);
        spinner = new JSpinner(spinnerModel);
        spinner.setBounds(120,80,300,20);
    }

    public JLabel getLabel(){
        return label;
    }
    public JTextField getField(){
        return field;
    }
    public JComboBox<String> getBox(){
        return comboBox;
    }
    public JSpinner getSpinner(){
        return spinner;
    }
}